package Abstract_Class1_Project;

public abstract class AbstractClassEx {
	// class 앞에 abstract 붙여주기
	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println(" -- fun1() START -- ");
	}
	
	public abstract void fun2();
	
	// 메소드가 선언만 돼있고 정의돼있지 않다.
	// 상속하고 있는 클래스에서 반드시 구현을 해줘야함
	// 이 부분이 인터페이스와 유사
}
