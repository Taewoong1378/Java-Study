package Networking_Project1;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		// 네트워크와 관련된 것은 반드시 예외처리를 해줘야됨
		
		try {
			serverSocket = new ServerSocket(9000);
			// 서버 로켓 생성, 클라이언트 맞을 준비가 완료 된 것
			// 9000 : 포트 번호
			// 하나의 서버에서 제공하는 서비스에 따라 포트가 다름
			
			System.out.println("클라이언트 맞을 준비 완료~~");
			
			// 서버 소켓을 받는 과정
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결~~");
			System.out.println("socket: " + socket);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
