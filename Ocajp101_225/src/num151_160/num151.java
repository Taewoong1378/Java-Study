package num151_160;

class Bird {

	public void fly() {
		System.out.println("Fly.");
	}
}

class Peacock extends Bird {
	public void dance() {
		System.out.println("Dance.");
	}
}

public class num151 {
	public static void main(String[] args) {
		Bird b = new Peacock();
		Peacock p = (Peacock) b;
		
		p.fly();
		p.dance();
	}
}
