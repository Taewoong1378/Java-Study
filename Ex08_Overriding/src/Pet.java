class Animal {
	String name;
	int age;
	
	void printPet() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Dog extends Animal {
	String variety;
	
	// 함수의 오버라이딩
	void printPet() {
		super.printPet(); // 부모 클래스에 있는 printPet 메서드를 호출함
						  // 만약 super.pritnPet();을 주석처리하면 기능의 변경됨.
						  // 기능 추가 / 변경 모두 오버라이딩
		System.out.println("종류 : " + variety);
	}
}

public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "진돌이";
		dog.age = 5;
		dog.variety = "진돗개";
		dog.printPet();

	}

}
