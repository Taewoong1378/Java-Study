package Class_Project;

public class Grandeur2 {

	public String color;
	public String gear;
	public int price;
	
	// �̷� ������ �����ڸ� ����� �͵� �����ϴ�.
	// �����ڴ� �� �ϳ����� �� �ʿ� X �������� ����
	public Grandeur2(String c, int p) {
		System.out.println("Grandeur constructor");
		color = c;
		price = p;
	}
	
	public void run() {
		System.out.println(" -- run() --");
	}
	
	public void stop() {
		System.out.println(" -- stop() --");
	}
	
	public void info() {
		System.out.println(" -- info() --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
