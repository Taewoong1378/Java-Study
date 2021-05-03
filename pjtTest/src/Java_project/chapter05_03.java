package Java_project;

public class chapter05_03 {

	public static void main(String[] args) {
		
		//서식문자 정렬 기능
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		//서식문자 소수점 제한 기능
		System.out.printf("%f\n", 1.23);	
		System.out.printf("%.0f\n", 1.23); //정수부분만 출력하라
		System.out.printf("%.1f\n", 1.23); //소수 첫 번째 자리까지만 출력하라
		System.out.printf("%.2f\n", 1.23); //소수 두 번째 자리까지만 출력하라
		System.out.printf("%.3f\n", 1.23); //소수 세 번째 자리까지만 출력하라
	}
	
}
