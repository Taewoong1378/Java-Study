package num161_170;

public class num161 {

	private char var;
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		num161 obj1 = new num161();
		num161 obj2 = obj1;
		obj1.var = 'o';
		obj2.var = 'i';
		
		System.out.println(var1 + ", " + var2);
		System.out.println(obj1.var + ", " + obj2.var);
	}
}
