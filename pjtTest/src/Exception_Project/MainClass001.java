package Exception_Project;

public class MainClass001 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); //� ���ܰ� �߻��ߴ��� �ܼ�â�� ������ִ� �޼ҵ�
			String msg = e.getMessage(); // ���ܸ� �����ϰ� ��Ÿ�� ���ڿ��� �޴� ��
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Exception AFTER");
		
	}
	
}
