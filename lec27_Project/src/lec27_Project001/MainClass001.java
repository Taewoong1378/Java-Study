package lec27_Project001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainClass001 {
	
	public static void main(String[] args) {
		
		
//		// read()
//		InputStream inputStream = null;
//		try {
//			
//			inputStream = new FileInputStream("C:\\Java\\pjtEX\\hello.txt");
//			int data = 0;
//			
//			while(true) {
//				
//				try {
//					data = inputStream.read();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				if(data == -1) break;
//				System.out.println("data : " + data);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//				try {
//					if(inputStream != null) inputStream.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//		}
//		// Hello Java가 아스키 코드 형태로 출력이 된다.
		
		
		// read(byte[])
				InputStream inputStream = null;
				try {
					
					inputStream = new FileInputStream("C:\\Java\\pjtEX\\hello.txt");
					int data = 0;
					byte[] bs = new byte[3]; 
					
					while(true) {
						
						try {
							data = inputStream.read(bs);
						} catch (IOException e) {
							e.printStackTrace();
						}
						if(data == -1) break;
						System.out.println("data : " + data);
						for (int i = 0; i < bs.length; i++) {
							System.out.println("bs[" + i + "] : " + bs[i]);
						}
						
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
						try {
							if(inputStream != null) inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
				}
				
	}
	
}
