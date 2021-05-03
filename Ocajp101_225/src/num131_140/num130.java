package num131_140;

public class num130 {

	String name;
	boolean contract;
	double salary;
	num130(){
		// line n1
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
	
	public static void main(String[] args) {
		num130 e = new num130();
		e.name = "Joe";
		e.contract = true;
		e.salary = 100;
		
		System.out.println(e);
	}
}
