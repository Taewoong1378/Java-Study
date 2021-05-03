package num161_170;

public class num163 {

	int id;
	String name;
	public num163(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		num163 p1 = new num163(101, "Pen");
		num163 p2 = new num163(101, "Pen");
		num163 p3 = p1;
		boolean ans1 = p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1 + ":" + ans2);
	}
}
