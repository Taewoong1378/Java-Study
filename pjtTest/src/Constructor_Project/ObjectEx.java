package Constructor_Project;

public class ObjectEx {
	
	public int x;
	public int y;
	
	public ObjectEx(String s, int[] iArr) {
		System.out.println("--ObjectEx()--");
		System.out.println("s ------>" + s);
		System.out.println("iArr ------>" + iArr);
	}
	
	public ObjectEx(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public void getInfo() {
		System.out.println("x ----> " + x);
		System.out.println("y ----> " + y);
	}
	
}

