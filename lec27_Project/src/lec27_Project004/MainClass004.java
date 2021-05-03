package lec27_Project004;

// read와 write는 아스키 코드를 기준으로 읽고 씀
// 인간이 읽을 수 있는 코드로 입출력하는게 바로 Data ~ Stream

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass004 {
	
	public static void main(String[] args) {
		
		String str = "Hello Java World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\Java\\\\pjtEX\\helloWorld.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			// outputStream을 매개변수로 넣고 있음
			
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
