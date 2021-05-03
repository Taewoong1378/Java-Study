package team1;

import team2.AnotherClass2;

public class AccessTest {
	public int num1;
	private int num2;
	protected int num3;
	int num4;
	
	public void test1() { System.out.println("test1"); }
	private void test2() { System.out.println("test2"); }
	protected void test3() { System.out.println("test3"); }
	void test4() { System.out.println("test4"); }
	
	public static void main(String[] args) {
		
		// 같은 클래스 내부에 있는 멤버변수에서는 모두 접근 가능
		AccessTest at = new AccessTest();
		at.num1 = 1;
		at.num2 = 2;
		at.num3 = 3;
		at.num4 = 4;
		
		// 같은 패키지 안에 있는 멤버변수에 접근하기
		AnotherClass1 ac1 = new AnotherClass1();
		ac1.num1 = 1;
		// ac1.num2 = 2;   --> 에러가 뜬다.
		ac1.num3 = 3;
		ac1.num4 = 4;
		
		// 다른 패키지에 있는 멤버변수에 접근하기
		AnotherClass2 ac2 = new AnotherClass2();
		// Ctrl + shift + o를 누르면 자동으로 AnotherClass2가 import 된다!
		ac2.num1 = 1;
		// ac2.num2 = 2;   --> 에러가 뜬다.
		// ac2.num3 = 3;   --> 에러가 뜬다.
		// ac2.num4 = 4;   --> 에러가 뜬다.

	}

}
