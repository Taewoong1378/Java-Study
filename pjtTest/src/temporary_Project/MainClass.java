package temporary_Project;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input : ");
		int num = scan.nextInt();
				
		do {
			System.out.println("Ȧ���� ����Ǵ� ���α׷��� �����մϴ�.");
			if(num % 2 == 0) {
				System.out.println(num + "�� Ȧ���� �ƴմϴ�");
				System.out.println("input : ");
				num = scan.nextInt();
			} else {
				System.out.println(num + "�� Ȧ���̹Ƿ� ���α׷��� �����մϴ�.");
			}
		} while(num % 2 == 0);
	}
}
