package num211_220;

public class num222 {

	int x;
	int y;
	public void doStuff(int x, int y) {
		x = x;
		y = this.y;
	}
	public void display() {
		System.out.println(x + " " + y + ":");
	}
	public static void main(String[] args) {
		num222 m1 = new num222();
		m1.x = 100;
		m1.y = 200;
		num222 m2 = new num222();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
	}
}
