// static�� ����

class Cat {
	static int a = 5;
	int num = 3;
	
	void Print (int num3) {
		System.out.println("a:" + a);
		num = num3;
		System.out.println("num:" + num);
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		
		Cat cat1 = new Cat();
		cat1.num = 1;
		cat1.a = 10;
		cat1.Print(20);
		System.out.println(cat1.num);
		System.out.println(cat1.a);
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		cat2.a = 11;
		cat2.Print(20);
		System.out.println(cat2.num);
		System.out.println(cat2.a);
		System.out.println(cat1.a);
	}
	/*����� cat2.a�� cat1.a�� ��� 11�� ����ϴ� ���� �� �� 
	 * ����. cat1.num�� cat2.num�� ������� num�� static 
	 * Ű���带 ������� �ʾұ� ������ �̸� ������ �� ���� 
	 * ���� �ٸ� ���� ������, cat2.a�� cat1.a�� ��� static 
	 * Ű���带 ����� ������� a�� �����ϱ� ������ �� �ڿ� 
	 * a�� 11�� �ʱ�ȭ ���� �� �� �� 11�̶�� ���� ������ �ȴ�.*/

}
