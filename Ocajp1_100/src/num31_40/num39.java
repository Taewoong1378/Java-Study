package num31_40;

public class num39 {
	String s;
	public boolean equals(num39 str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	
	num39(String s){
		this.s = s;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Moon";
		num39 s2 = new num39("Moon");
		
		if((s1=="Moon") && (s2.equals("Moon"))) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		if(s1.equalsIgnoreCase(s2.s)) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
