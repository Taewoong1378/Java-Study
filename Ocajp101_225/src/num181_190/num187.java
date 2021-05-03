package num181_190;

public class num187 {

	int a1;
	
	static void doProduct(int a) {
		a = a * a;
	}
	
	static void doString(String s) {
		s.concat(" " + s);
	}
	
	public static void main(String[] args) {
		
		num187 item = new num187();
		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + " " + sb + " " + item.a1);
	}
}
