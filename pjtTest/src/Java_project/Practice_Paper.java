package Java_project;

import java.util.Arrays;

public class Practice_Paper {

	public static void main(String[] args) {
		
		System.out.println("Good\tMorning~\n");
		System.out.println("Good\nMorning~\n");
		System.out.println("Good\'Morning~\'\n");
		
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);
		int num1 = 10;
		System.out.printf("������ ����� %d�� �Դϴ�.\n", num1);
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n", 6,2,10);
		int num2 = 30;
		System.out.printf("%d\n",num2);
		System.out.printf("%o\n",num2);
		System.out.printf("%x\n",num2);
		
		System.out.printf("�ҹ��� \'%s\'�� �빮�ڴ� \'%s\'�Դϴ�.",'a','A');
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n","java","Java");
		
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123);
		System.out.printf("%10d\n",1234);
		
		System.out.printf("%f\n",1.23);
		System.out.printf("%.1f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		
		int x = 10;
		System.out.println("++x : " + (++x));
		x = 10;
		System.out.println("x+=1 : " + (x+=1));
		
		x = 10;
		System.out.println(--x);
		
		x = 10;
		int y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = 0;
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result);
		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(!b2);
		
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {100, 200, 300, 400, 500};
		System.out.println(Arrays.toString(arr2));
		
		String [] name = new String[5];
		name[0] = "����ȣ";
		name[1] = "�̽¿�";
		name[2] = "�ں�ȣ";
		name[3] = "�̺���";
		name[4] = "������";
		
		System.out.println(Arrays.toString(name));
		
		int [] arrAtt1 = {10, 20, 30, 40, 50};
		int [] arrAtt2 = null;
		int [] arrAtt3 = null;
		
		System.out.println(arrAtt1.length);
		System.out.println(Arrays.toString(arrAtt1));
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		arrAtt2 = arrAtt1;
		System.out.println(arrAtt1);
		System.out.println(arrAtt2);
		System.out.println(arrAtt3);
		System.out.println();
		
		int[][] matrix = new int [3][2];
		matrix[0][0] =1;
		matrix[0][1] =2;
		matrix[1][0] =3;
		matrix[1][1] =4;
		matrix[2][0] =5;
		matrix[2][1] =6;
		
		System.out.println(Arrays.toString(matrix[0]));
		System.out.println(Arrays.toString(matrix[1]));
		System.out.println(Arrays.toString(matrix[2]));

		int mid_score = 95;
		char p_eval = 'C';
		
		if (mid_score>=90 & p_eval == 'A') {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		int score = 65;
		if(score >= 90) {
			System.out.println("Grade : A");
		} else if (score >= 80) {
			System.out.println("Grade : B");
		} else if (score >= 70) {
			System.out.println("grade : C");
		} else {
			System.out.println("Fail");
		}
		
		char grade = 'A';
		int total = 65;
		
		if (grade == 'A') {
			if (total >=90) {
				System.out.println("100%");
			} else if (total >= 80 ) {
				System.out.println("80%");
			} else {
				System.out.println("50%");
			}
		} else {
			System.out.println("None");
		}
		
		
		int score2 = 69;
		switch (score2) {
		case 100:
		case 90:
			System.out.println("��");
			break;

		case 80:
			System.out.println("��");
			break;
			
		case 70:
			System.out.println("��");
			break;	
			
		default:
			System.out.println("try again");
			break;
		}
		
		double d = 1.23d;
		System.out.println(d);
	}
}

