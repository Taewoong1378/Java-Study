package Java_project;

public class chapter06_01 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// 대입 연산자
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		
		
		x = y;
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		
		
		// 산술 연산자
		x = 10; y = 20;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		
		// 복합대입 연산자
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		
		x = 10;
		System.out.println("x -= 10 : " + (x -= 10));
		
		x = 10;
		System.out.println("x *= 10 : " + (x *= 10));
		
		x = 10;
		System.out.println("x /= 10 : " + (x /= 10));
		
		x = 10;
		System.out.println("x %= 10 : " + (x %= 10));
	}
}
