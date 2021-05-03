package num151_160;

public class num156 {

	static int count = 0;
	int i = 0;
	
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		
		num156 check1 = new num156();
		num156 check2 = new num156();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + ":" + check2.count);
	}
}
