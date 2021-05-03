package Java_project;

import java.util.Arrays;

public class chapter08_01 {

	public static void main(String[] args) {
		
		// 배열 기본속성
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		
		// 배열 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		
		// 배열 요소 출력
		System.out.println("arrAtt1 " + Arrays.toString(arrAtt1));
		
		
		// 배열 요소 복사
		// Arrays.copy0f(복사할 요소를 가진 배열, 그 배열의 크기)
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		
		// 배열 레퍼런스
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 " + arrAtt1);
		System.out.println("arrAtt2 " + arrAtt2);
		System.out.println("arrAtt3 " + arrAtt3);
		
		/*
		 주소를 보면 arrAtt1과 arrAtt2의 주소는 같음
		 하지만 arrAtt1과 arrAtt3의 주소는 다르다.
		 요소를 복사하면, 요소는 같지만 메모리의 다른 부분에 저장,
		 따라서 주소가 다르고, 배열 자체를 복사하면 메모리의 같은
		 부분에 할당되므로 주소가 같아진다.
		 */
		
		
		// 다차원 배열
		// 이차원 배열
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
