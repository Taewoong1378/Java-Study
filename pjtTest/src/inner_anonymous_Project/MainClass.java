package inner_anonymous_Project;

public class MainClass {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);
		
		System.out.println();
		
		// 멤버 inner 클래스
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : " + in.num);
		System.out.println("in.str2 : " + in.str2);
		
		System.out.println();
		
		// static inner 클래스
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : " + si.num);
		System.out.println("si.str3 : " + si.str3);
		
		System.out.println();
		
		// 익명(anonymous) 클래스
		// 인터페이스나 추상 클래스에서 주로 사용됨
		new AnonymousClass() {
			
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			};
		}.method();
	
	}

}
