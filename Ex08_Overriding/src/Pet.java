class Animal {
	String name;
	int age;
	
	void printPet() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

class Dog extends Animal {
	String variety;
	
	// �Լ��� �������̵�
	void printPet() {
		super.printPet(); // �θ� Ŭ������ �ִ� printPet �޼��带 ȣ����
						  // ���� super.pritnPet();�� �ּ�ó���ϸ� ����� �����.
						  // ��� �߰� / ���� ��� �������̵�
		System.out.println("���� : " + variety);
	}
}

public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "������";
		dog.age = 5;
		dog.variety = "������";
		dog.printPet();

	}

}
