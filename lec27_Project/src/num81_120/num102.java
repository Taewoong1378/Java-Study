package num81_120;

public class num102 {

	public static final int MIN = 1;

	public static void main(String[] args) {
		int x = args.length;
		if (checkLimit(x)) {
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
	}

	public static boolean checkLimit(int x) {
		return (x >= MIN) ? true : false;
	}
}
