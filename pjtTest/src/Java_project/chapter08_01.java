package Java_project;

import java.util.Arrays;

public class chapter08_01 {

	public static void main(String[] args) {
		
		// �迭 �⺻�Ӽ�
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		
		// �迭 ����
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		
		// �迭 ��� ���
		System.out.println("arrAtt1 " + Arrays.toString(arrAtt1));
		
		
		// �迭 ��� ����
		// Arrays.copy0f(������ ��Ҹ� ���� �迭, �� �迭�� ũ��)
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		
		// �迭 ���۷���
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 " + arrAtt1);
		System.out.println("arrAtt2 " + arrAtt2);
		System.out.println("arrAtt3 " + arrAtt3);
		
		/*
		 �ּҸ� ���� arrAtt1�� arrAtt2�� �ּҴ� ����
		 ������ arrAtt1�� arrAtt3�� �ּҴ� �ٸ���.
		 ��Ҹ� �����ϸ�, ��Ҵ� ������ �޸��� �ٸ� �κп� ����,
		 ���� �ּҰ� �ٸ���, �迭 ��ü�� �����ϸ� �޸��� ����
		 �κп� �Ҵ�ǹǷ� �ּҰ� ��������.
		 */
		
		
		// ������ �迭
		// ������ �迭
		int [][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));
	}
}
