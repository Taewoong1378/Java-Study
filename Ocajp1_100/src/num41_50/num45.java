package num41_50;

public class num45 {
	
	public static void main(String[] args) {
		short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;			// line n1
		
//		String s4 = (String) (s3 * s2);		// line n2
//		에러가 발생한다!
//		아래와 같이 고치면 해결됨
		
		String s4 = String.valueOf(s3 * s2);
		System.out.println("Sum is " + s4);
	}
}
