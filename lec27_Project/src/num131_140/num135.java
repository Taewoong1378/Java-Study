package num131_140;

public class num135 {

	public static void main(String[] args) {
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a<b) ? (a<c) ? a : (b<c) ? b: c: x;
		System.out.println(d);
		
		
		if(a<b) {
			if(a<c) {
				System.out.println(a);
			} else {
				if(b<c) {
					System.out.println(b);
				} else {
					System.out.println(c);
				}
			}
		} else {
			System.out.println(x);
		}
		
	}

}
