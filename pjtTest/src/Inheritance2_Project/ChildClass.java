package Inheritance2_Project;

public class ChildClass extends ParentClass {

	int openYear = 2000;
	
	public ChildClass() {
		
		System.out.println("ChildClass constructor");
		
	}
	
	// 메서드 오버라이드
	/* 상위 클래스의 기능을 업그레이드해서 나만의
	기능으로 만들고 싶을 때 사용하는 기능이다.*/
	
	@Override
	public void makeJJajang() {
		
		System.out.println(" -- more delicious makeJJajang() START --");
		
	}
	
	public void getOpenYear() {
		
		System.out.println("ChildClass's Open year : " + this.openYear);
		System.out.println("ParentClass's Open year : " + super.openYear);
		
	}

}
