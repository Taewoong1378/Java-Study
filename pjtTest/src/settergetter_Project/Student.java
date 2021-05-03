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

	// getter setter : ���콺 ������ ��ư���� ����

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
// name�� �����Ǹ� �ȵǱ� ������ ���������. 

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score > 50) {
		this.score = score;
		
		/*
		������ ���� �����ϰ� �ҰŸ� public�� ���� �Ǵ°� 
		�ƴϳ�? ��� �� �� �ִµ�, private�� ���� ������
		setter getter�� �����ν� if ���ǹ�ó�� ���͸� ��
		���� ����. ���� ���, �ӱ��� ������ �� �ְ� �صΰ�
		���� �ӱ� �����δ� ������ �� ���� �Ѵٴ��� ���
		 */
	
	}
}
}
