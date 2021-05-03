package num111_120;

public class num111 {

	String myStr = "9009";

	public void doStuff(String str) {
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr: " + myStr + ", myNum: " + myNum);
	}

	public static void main(String[] args) {
		num111 obj = new num111();
		obj.doStuff("7007");
	}
}