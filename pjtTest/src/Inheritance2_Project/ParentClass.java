package Inheritance2_Project;

public class ParentClass {
	
	// 모든 클래스는 object 클래스를 상속받는다.
	// ParentClass 위에 커서 두고 Ctrl + t 눌러보면 확인 가능
	// 따라서 object 클래스로 데이터타입을 맞춰주면 활용이 가능하다.
	
	int openYear = 1995;
	
	public ParentClass() {
		
		System.out.println("ParentClass constructor");
		
	}
	
	public void makeJJajang() {
		
		System.out.println(" -- makeJJajang() START --");
		
	}
	
}
