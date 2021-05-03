package Constructor_Project;

public class MainClass {
	
	public static void main(String[] args) {
		
		int [] iArr = {10,20,30};
		ObjectEx obj1 = new ObjectEx("Hello", iArr);
		ObjectEx obj2 = new ObjectEx(10, 20);
		
		obj2.getInfo();
	}
}
