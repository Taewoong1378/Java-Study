package lec27_Project002;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass002 {
	
	public static void main(String[] args) {
		
		
		// write()
		OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("C:\\Java\\pjtEX\\helloW.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(outputStream != null) outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		/*
		// write()
		OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("C:\\Java\\\\pjtEX\\helloW.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr, 0, 5);
				// 첫 번째 글자부터 5개를 출력 = Hello
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(outputStream != null) outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		 */
		
	}
	
}
