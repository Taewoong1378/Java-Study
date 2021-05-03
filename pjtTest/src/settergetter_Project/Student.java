package settergetter_Project;

public class Student {

	private String name;
	private int score;
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println("--getInfo()--");
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}

	// getter setter : 마우스 오른쪽 버튼으로 가능

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
// name은 수정되면 안되기 때문에 없애줘야함. 

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score > 50) {
		this.score = score;
		
		/*
		어차피 수정 가능하게 할거면 public을 쓰면 되는거 
		아니냐? 라고 할 수 있는데, private을 쓰고 다음에
		setter getter을 씀으로써 if 조건문처럼 필터를 걸
		수가 있음. 예를 들어, 임금을 수정할 수 있게 해두고
		최저 임금 밑으로는 수정할 수 없게 한다던가 등등
		 */
	
	}
}
}
