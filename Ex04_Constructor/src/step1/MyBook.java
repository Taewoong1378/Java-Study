package step1;

// Ŭ���� ����
class Book {
	String title; // å ����
	int price;	  // å ����
	int num;	  // �ֹ�����
	
	// ����Ʈ ������
	Book(){
		title = "�ڹ� Ŭ���� ����";
		price = 10000;
	}
	
	// ����� ���� ������
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	// �޼ҵ�
	void print() {
		System.out.println("��    �� : " + title);
		System.out.println("��    �� : " + price);
		System.out.println("�ֹ����� : " + num);
		System.out.println("�հ�ݾ� : " + price * num);
	}
}

public class MyBook {

	public static void main(String[] args) {
		// Book book = new Book();
		Book book = new Book("�ڹ� ������ ����", 20000);
		book.num = 5;
		book.print();
	}

}
