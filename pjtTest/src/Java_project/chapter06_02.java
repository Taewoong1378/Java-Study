package Java_project;

public class chapter06_02 {
	
	public static void main(String[] args) {
		
		// 관계연산자
		int x = 10;
		int y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println();
		
		
		// 증감연산자
		// ++ : 1만큼 증가, -- : 1만큼 감소
		
		// 1. 전위 연산자
		x = 10;
		System.out.println("++x : " + (++x));
		
		x = 10;
		System.out.println("++x : " + (--x));
		
		
		
		// 2. 후위 연산자
		x = 10;
		System.out.println("x++ : " + (x++));
		System.out.println("x : " +x);
		
		/*
		 콘솔 창에는 x의 값을 출력하고 메모리 상에서는
		 x에 1을 더한 값을 넣어줌
		 */
		
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " +x);
		
		/*
		 콘솔 창에는 x의 값을 출력하고 메모리 상에서는
		 x에 1을 뺀 값을 넣어줌
		 */
		
		
		
		// 논리 연산자
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		System.out.println("!b1 : " + !b1);
		System.out.println("!b2 : " + !b2);
		System.out.println();
		
		
		// 조건(삼항) 연산자
		// 조건식 ? 식1 : 식2
		
		/*
		 조건식이 참이면 식1이 실행되고,
		 조건식이 거짓이면 식2가 실행된다.
		 */
		
		x = 10; y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result);
		System.out.println();
		
		// 비트 연산자 (별로 필요는 없음. 연산 방법만 알기)
		x = 2;
		y = 3;
		System.out.println("x & y : " + (x & y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x ^ y : " + (x ^ y));
	}
}
