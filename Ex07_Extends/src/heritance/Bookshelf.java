package heritance;

class Book {
	String title;
	
	void printBook() {
		System.out.println("��  �� : " + title);
	}
}

class Novel extends Book{
	String writer;
	
	void printNov() {
		printBook();
		System.out.println("��  �� : " + writer);
	}
}

class Magazine extends Book{
	int day;
	
	void printMag() {
		printBook();
		System.out.println("�߸��� : " + day + "��");
	}
}


public class Bookshelf {

	public static void main(String[] args) {
		Novel nov = new Novel();
		nov.title = "ȫ�浿��";
		nov.writer = "���";
		
		Magazine mag = new Magazine();
		mag.title = "���� �ڹ�";
		mag.day = 20;
		
		nov.printNov();
		System.out.println();
		mag.printMag();
	}
}