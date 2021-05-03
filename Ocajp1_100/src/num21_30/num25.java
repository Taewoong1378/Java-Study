package num21_30;

public class num25 {

	int x, y;
	
	public num25(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		num25 obj = new num25(x, y);
		System.out.println(x + " " + y);
	}

}
