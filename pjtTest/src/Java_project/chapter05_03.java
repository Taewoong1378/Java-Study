package Java_project;

public class chapter05_03 {

	public static void main(String[] args) {
		
		//���Ĺ��� ���� ���
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		//���Ĺ��� �Ҽ��� ���� ���
		System.out.printf("%f\n", 1.23);	
		System.out.printf("%.0f\n", 1.23); //�����κи� ����϶�
		System.out.printf("%.1f\n", 1.23); //�Ҽ� ù ��° �ڸ������� ����϶�
		System.out.printf("%.2f\n", 1.23); //�Ҽ� �� ��° �ڸ������� ����϶�
		System.out.printf("%.3f\n", 1.23); //�Ҽ� �� ��° �ڸ������� ����϶�
	}
	
}
