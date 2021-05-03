package num81_90;

class C {
	public C() {
		System.out.println("C ");
	}
}

class B extends C{
	public B() {
		System.out.println("B ");
	}
}

public class num82 extends B {
	
	public num82() {
		System.out.println("A ");
	}
	
	public static void main(String[] args) {
		
		num82 a = new num82();
	}
}

