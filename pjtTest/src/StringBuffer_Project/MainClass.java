package StringBuffer_Project;

public class MainClass {

	public static void main(String[] args) {
		
		// String
		// String str = "java"; 
		
		String str = new String("java");
		// 원래 이렇게도 만들 수 있다.
		// String을 많이 쓰다보니 java에서 편의성을 위해
		// String str = "java"; 를 가능케 한 것
		
		str = str + " world";
		System.out.println("str : " + str);
		
		System.out.println();
		
		// StringBuffer
		StringBuffer sf = new StringBuffer("java");
		System.out.println("sf : " + sf);
		System.out.println();
		
		// 문자의 길이 구하기
		System.out.println("sf.length() : " + sf.length());
		System.out.println();
		
		// 뒤에 추가로 문자 붙이기
		sf.append(" world");
		System.out.println("sf : " + sf);
		System.out.println();
		
		// 특정 위치에 문자 추가하기
		sf.insert(4, "~~~~");
		System.out.println("sf : " + sf);
		sf.insert(sf.length(), "!!");
		System.out.println("sf : " + sf);
		System.out.println();
		
		// 특정 위치에 있는 문자 제거하기
		sf.delete(4, 8);
		System.out.println("sf : " + sf);
		sf.delete(sf.length()-2, sf.length());
		System.out.println("sf : " + sf);
		System.out.println();
		
		sf.deleteCharAt(4);
		System.out.println("sf : " + sf);
		System.out.println();
		
		// StringBuilder
		StringBuilder sd = new StringBuilder("java");
		sd.append(" world");
		System.out.println("sd : " + sd);
		
		System.out.println("sd.length() : " + sd.length());
		
		sd.append(" world");
		System.out.println("sd : " + sd);
		sd.insert(4, "~~~~");
		System.out.println("sd : " + sd);
		sd.insert(sd.length(), "!!");
		System.out.println("sd : " + sd);
		sd.delete(4, 8);
		System.out.println("sd : " + sd);
		sd.delete(sd.length()-2, sd.length());
		System.out.println("sd : " + sd);
		sd.deleteCharAt(4);
		System.out.println("sd : " + sd);
		
		
	}
	
}
