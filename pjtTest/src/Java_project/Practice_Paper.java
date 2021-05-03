package Java_project;

import java.util.Arrays;

public class Practice_Paper {

	public static void main(String[] args) {
		
		System.out.println("Good\tMorning~\n");
		System.out.println("Good\nMorning~\n");
		System.out.println("Good\'Morning~\'\n");
		
		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
		int num1 = 10;
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);
		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6,2,10);
		int num2 = 30;
		System.out.printf("%d\n",num2);
		System.out.printf("%o\n",num2);
		System.out.printf("%x\n",num2);
		
		System.out.printf("소문자 \'%s\'의 대문자는 \'%s\'입니다.",'a','A');
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n","java","Java");
		
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
		name[0] = "박찬호";
		name[1] = "이승엽";
		name[2] = "박병호";
		name[3] = "이병규";
		name[4] = "류현진";
		
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
			System.out.println("수");
			break;

		case 80:
			System.out.println("우");
			break;
			
		case 70:
			System.out.println("미");
			break;	
			
		default:
			System.out.println("try again");
			break;
		}
		
		double d = 1.23d;
		System.out.println(d);
	}
}

