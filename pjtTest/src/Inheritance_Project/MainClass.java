package Inheritance_Project;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		
		child.parentFun();
		child.childFun();
		
		System.out.println("child.str : " + child.str);
//		System.out.println("child.num : " + child.num);
//		child.parentPrivateFun();
//		private 접근자의 속성과 메서드는 이용할 수 없다.		
				
	}
	
	
}
