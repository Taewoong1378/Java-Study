package settergetter_Project;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("ȫ�浿",90);
		student1.getInfo();
		System.out.println();
		System.out.println(student1.getScore());
		
		/*
		 �ٵ� ���� ȫ�浿�� ������ ������ �־ ȫ�浿��
		 ������ 100������ �ؾߵȴ�. �ٵ� score ���������
		 ���, private���� ���ֱ� ������ ������ ���� ����.
		 �̶� getter setter�� ���ش�!
		 */
		
		System.out.println();
		student1.setScore(100);
		student1.getInfo();
	}
}
