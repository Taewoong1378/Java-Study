package num51_60;

public class num60 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		String s = "Java";
		
		System.out.println(sb);
		System.out.println(sb.equals(s));
		
		if(sb.toString().equals((s.toString()))) {
			System.out.println("Match 1");
		} else if (sb.equals(s)) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
		
	}
}
