package Java_project;

public class chapter07_01 {
	
	public static void main(String[] args) {
	
		// 배열 선언 후 초기화
		// 배열 안에 들어가는 자료형은 모두 동일해야됨
		int[] arr1 = new int[5];	// int형 변수가 5개 들어간다
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
		
		
		// 배열 선언과 초기화를 동시에
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
		
		// java는 배열이 한 번 정해지면 크기가 변경될 수가 없다.
	}
}
