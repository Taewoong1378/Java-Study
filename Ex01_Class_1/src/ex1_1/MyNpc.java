package ex1_1;
// Ŭ���� ����
class Npc {
	// �ʵ� - ������
	String name;
	int hp;
	// �޼��� - ����
	void say() {
		System.out.println("�ȳ��ϼ���.");
	}
	
}

public class MyNpc {

	public static void main(String[] args) {
		Npc saram1 = new Npc();
		// saram1 : ��ü ����
		saram1.name = "���";
		saram1.hp = 100;
		System.out.println(saram1.name + ":" +
		                   saram1.hp);
		// �޼��� ȣ��
		saram1.say();
		}	
	}

// class�� �̿��� ��ü ����
// Npc��� Ŭ������ �̿��� ��ü ����