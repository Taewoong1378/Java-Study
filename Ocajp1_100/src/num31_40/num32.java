package num31_40;

public class num32 {
	
	static int count;	// static int count; �� �Ǹ� D�� ����
	public static void displayMsg() {
		count++;
	System.out.println("Welcome "+"Visit Count: "+count);
	}
	
	public static void main(String[] args) {
		num32.displayMsg();
		num32.displayMsg();
	}
}
