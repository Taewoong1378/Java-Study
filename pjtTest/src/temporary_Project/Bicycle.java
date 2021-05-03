package temporary_Project;

public class Bicycle {

	String color;
	int price;
	
	public Bicycle() {
		System.out.println("Bicycle constructor");
	}
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor");
		this.color = c;
		this.price = p;
	}
	
	public void Info() {
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
	
	
}
