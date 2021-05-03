package Inheritance2_Project;

public class MainClass {

	public static void main(String[] args) {
		
		// 메서드 오버라이드(Override)
		ChildClass child = new ChildClass();
		child.makeJJajang();
		
		System.out.println();
		
		// 객체 생성
		// FirstChildClass fch = new FirstChildClass();
		// SecondChildClass sch = new SecondChildClass();
		// 아래와 같은 의미이다. ParentClass를 상속받고 있기 때문!
		
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		// 기본 자료형처럼 클래스도 자료형으로 취급한다.
		
		/* 엄연히 FirstChildClass와 SecondChildClass는
		다른 클래스임에도 불구하고 ParentClass를 상속
		받기 때문에 데이터타입을 통일시켜줄 수 있다.
		따라서 같은 배열에 넣어줄 수 있다! (아래) */
		
		// 자료형(타입) - 배열 생성
		// ParentClass pArr [] = new ParentClass[2];
		// 이렇게 만들어도 됨
		
		ParentClass [] pArr = new ParentClass[2];
		pArr[0] = fch;
		pArr[1] = sch;
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].makeJJajang();
		}
		
		System.out.println();
		
		// Object 클래스
		Object objs[] = new Object[2];
		objs[0] = new FirstChildClass();
		objs[1] = new SecondChildClass();
		
		for (int i = 0; i < objs.length; i++) {
//			objs[i].makeJJajang();
			
			if(i == 0) {
				((FirstChildClass)objs[i]).makeJJajang();
			} else {
				((SecondChildClass)objs[i]).makeJJajang();
			}
		}
		
		System.out.println();
		
		// super
		ChildClass c = new ChildClass();
		c.getOpenYear();
	}
	
}
