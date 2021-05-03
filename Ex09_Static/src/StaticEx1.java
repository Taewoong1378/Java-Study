// static의 이해

class Cat {
	static int a = 5;
	int num = 3;
	
	void Print (int num3) {
		System.out.println("a:" + a);
		num = num3;
		System.out.println("num:" + num);
	}
}

public class StaticEx1 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		
		Cat cat1 = new Cat();
		cat1.num = 1;
		cat1.a = 10;
		cat1.Print(20);
		System.out.println(cat1.num);
		System.out.println(cat1.a);
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		cat2.a = 11;
		cat2.Print(20);
		System.out.println(cat2.num);
		System.out.println(cat2.a);
		System.out.println(cat1.a);
	}
	/*결과로 cat2.a와 cat1.a가 모두 11을 출력하는 것을 볼 수 
	 * 있음. cat1.num과 cat2.num은 멤버변수 num이 static 
	 * 키워드를 사용하지 않았기 때문에 이를 공유할 수 없어 
	 * 각각 다른 값을 갖지만, cat2.a와 cat1.a의 경우 static 
	 * 키워드를 사용해 멤버변수 a를 공유하기 때문에 맨 뒤에 
	 * a를 11로 초기화 했을 때 둘 다 11이라는 값을 가지게 된다.*/

}
