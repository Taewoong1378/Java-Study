package num81_120;

public class num110 {

	public static int stVar = 100;
	public int var = 200;

	public String toString() {
		return stVar + ":" + var;
	}

	public static void main(String[] args) {

		num110 t1 = new num110();
		t1.var = 300;
		System.out.println(t1);

		num110 t2 = new num110();
		t2.stVar = 300;
		System.out.println(t2);
	}
}
