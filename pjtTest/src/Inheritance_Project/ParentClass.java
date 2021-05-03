package Inheritance_Project;

public class ParentClass {
	
	public String str = "ParentClass";
	private int num = 10;
	
	public ParentClass() {
		
		System.out.println("ParentClass constructor");
		
	}
	
	public void parentFun() {
		
		System.out.println("-- parentFun() START -- ");
		
	}
	
	// private 접근자의 속성과 메서드는 상속받을 수 없다.
	private void parentPrivateFun() {
		
		System.out.println("-- parentPrivateFun() START -- ");
		
	}

}
