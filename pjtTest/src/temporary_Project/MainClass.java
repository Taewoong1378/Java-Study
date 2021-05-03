package temporary_Project;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input : ");
		int num = scan.nextInt();
				
		do {
			System.out.println("홀수면 종료되는 프로그램을 실행합니다.");
			if(num % 2 == 0) {
				System.out.println(num + "은 홀수가 아닙니다");
				System.out.println("input : ");
				num = scan.nextInt();
			} else {
				System.out.println(num + "은 홀수이므로 프로그램을 종료합니다.");
			}
		} while(num % 2 == 0);
	}
}
