package Java_project;

import pjtTest.Bicycle;

/*
 import pjtTest.*; 를 사용하면 pjtTest 패키지 안에 있는 
 모든 클래스를 이용할 수 있다.
 */

public class chapter16_01 {

	public static void main(String[] args) {
	
		Bicycle myBicy1 = new Bicycle("red", 300);
		
		myBicy1.info();
	}

}
