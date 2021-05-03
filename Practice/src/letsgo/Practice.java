package letsgo;

interface Lambda {
	
	public void method(String s1, int i1);
}

class Practice {

	public static void main(String[] args) {
		
		Lambda add = (s1, i1) -> {
			System.out.println(s1 + " " + i1);
		};
		
		add.method("I love you", 3000);
	}
}