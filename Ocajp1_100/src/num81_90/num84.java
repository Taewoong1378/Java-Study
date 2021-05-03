package num81_90;

public class num84 {
	
	int num;
	public static void graceMarks(num84 obj4) {
		obj4.num += 10;
	}
	public num84() {
		num84 obj1 = new num84();
		num84 obj2 = obj1;
		num84 obj3 = null;
		obj2.num=60;
		graceMarks(obj2);
	}
}