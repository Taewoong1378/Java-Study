package Networking_Project1;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		// ��Ʈ��ũ�� ���õ� ���� �ݵ�� ����ó���� ����ߵ�
		
		try {
			serverSocket = new ServerSocket(9000);
			// ���� ���� ����, Ŭ���̾�Ʈ ���� �غ� �Ϸ� �� ��
			// 9000 : ��Ʈ ��ȣ
			// �ϳ��� �������� �����ϴ� ���񽺿� ���� ��Ʈ�� �ٸ�
			
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�~~");
			
			// ���� ������ �޴� ����
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����~~");
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
