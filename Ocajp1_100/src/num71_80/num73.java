package num71_80;

public class num73 {

	public static void main(String[] args) {
		
		int x;
		
		// a
		for(x=0;x<100;++x) {
			System.out.println("Welcome " + x);
		}
		System.out.println();
		
		// b
		for(x=100;x<=100;x++) {
			System.out.println("Welcome " + x);
		}
		System.out.println();
		
		// c
		x = 100;
		while(x<=100) {
			x++;
			System.out.println("Welcome " + x);
		}
		System.out.println();
		
		// d
		x = 100;
		do {
			++x;
			System.out.println("Welcome " + x);
		} while (x <100);
		System.out.println();
	}
}
