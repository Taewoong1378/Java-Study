package Java_project;

public class chapter07_01 {
	
	public static void main(String[] args) {
	
		// �迭 ���� �� �ʱ�ȭ
		// �迭 �ȿ� ���� �ڷ����� ��� �����ؾߵ�
		int[] arr1 = new int[5];	// int�� ������ 5�� ����
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
	
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		System.out.println();
		
		
		// �迭 ����� �ʱ�ȭ�� ���ÿ�
		/*
		int[] arr2 = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 300;
		arr2[3] = 40;
		arr2[4] = 50;
		*/
		
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4]);
		
		// java�� �迭�� �� �� �������� ũ�Ⱑ ����� ���� ����.
	}
}
