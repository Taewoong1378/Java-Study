package Inheritance_Project;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		
		child.parentFun();
		child.childFun();
		
		System.out.println("child.str : " + child.str);
//		System.out.println("child.num : " + child.num);
//		child.parentPrivateFun();
//		private �������� �Ӽ��� �޼���� �̿��� �� ����.		
				
	}
	
	
}
