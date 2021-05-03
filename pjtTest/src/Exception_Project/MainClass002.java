package Exception_Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass002 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception BEFORE");
		
		try {
			
			System.out.println("input i : ");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();
			
			System.out.println("i / j = " + ( i / j));
			
			for (int k = 0; k < 5; k++) {
				System.out.println("iArr["+ k + "] : " + iArr[k]);
			}
			
			System.out.println("list.size() : " + list.size());
			
		} catch (InputMismatchException e) {
			// i와 j가 숫자를 받아야하는데 문자를 받은 경우
			e.printStackTrace();
			// 그냥 catch (Exception e) { 해도 상관 X
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// 만약 위에 for문에 있는 k가 6이 되면 예외 발생
			e.printStackTrace();
			// 그냥 catch (Exception e) { 해도 상관 X
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception AFTER");
		scanner.close();
	}
	
}
