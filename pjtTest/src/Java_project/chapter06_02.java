package Java_project;

public class chapter06_02 {
	
	public static void main(String[] args) {
		
		// ���迬����
		int x = 10;
		int y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println();
		
		
		// ����������
		// ++ : 1��ŭ ����, -- : 1��ŭ ����
		
		// 1. ���� ������
		x = 10;
		System.out.println("++x : " + (++x));
		
		x = 10;
		System.out.println("++x : " + (--x));
		
		
		
		// 2. ���� ������
		x = 10;
		System.out.println("x++ : " + (x++));
		System.out.println("x : " +x);
		
		/*
		 �ܼ� â���� x�� ���� ����ϰ� �޸� �󿡼���
		 x�� 1�� ���� ���� �־���
		 */
		
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " +x);
		
		/*
		 �ܼ� â���� x�� ���� ����ϰ� �޸� �󿡼���
		 x�� 1�� �� ���� �־���
		 */
		
		
		
		// �� ������
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		System.out.println("!b1 : " + !b1);
		System.out.println("!b2 : " + !b2);
		System.out.println();
		
		
		// ����(����) ������
		// ���ǽ� ? ��1 : ��2
		
		/*
		 ���ǽ��� ���̸� ��1�� ����ǰ�,
		 ���ǽ��� �����̸� ��2�� ����ȴ�.
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
		
		// ��Ʈ ������ (���� �ʿ�� ����. ���� ����� �˱�)
		x = 2;
		y = 3;
		System.out.println("x & y : " + (x & y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x ^ y : " + (x ^ y));
	}
}
