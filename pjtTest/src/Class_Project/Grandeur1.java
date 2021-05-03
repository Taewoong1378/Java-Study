package Class_Project;

public class Grandeur1 {

	public String color;
	public String gear;
	public int price;
	
	
	public Grandeur1() {
		System.out.println("Grandeur constructor");
	}
	
	// class 이름만 치고 ctrl + enter하면 생성자 만들 수 있음
	
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
