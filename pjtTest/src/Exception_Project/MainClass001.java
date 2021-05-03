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
			e.printStackTrace(); //어떤 예외가 발생했는지 콘솔창에 출력해주는 메소드
			String msg = e.getMessage(); // 예외를 간략하게 나타낸 문자열을 받는 것
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Exception AFTER");
		
	}
	
}
