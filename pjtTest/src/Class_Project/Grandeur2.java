package Class_Project;

public class Grandeur2 {

	public String color;
	public String gear;
	public int price;
	
	// 이런 식으로 생성자를 만드는 것도 가능하다.
	// 생성자는 꼭 하나여야 될 필요 X 여러개도 가능
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
