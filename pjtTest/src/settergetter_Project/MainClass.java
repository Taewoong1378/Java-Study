package settergetter_Project;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동",90);
		student1.getInfo();
		System.out.println();
		System.out.println(student1.getScore());
		
		/*
		 근데 만약 홍길동의 점수에 오류가 있어서 홍길동의
		 점수를 100점으로 해야된다. 근데 score 멤버변수의
		 경우, private으로 돼있기 때문에 수정이 되지 않음.
		 이때 getter setter를 써준다!
		 */
		
		System.out.println();
		student1.setScore(100);
		student1.getInfo();
	}
}
