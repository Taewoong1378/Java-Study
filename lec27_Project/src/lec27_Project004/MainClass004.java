package lec27_Project004;

// read�� write�� �ƽ�Ű �ڵ带 �������� �а� ��
// �ΰ��� ���� �� �ִ� �ڵ�� ������ϴ°� �ٷ� Data ~ Stream

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
			// outputStream�� �Ű������� �ְ� ����
			
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
