package Abstract_Class1_Project;

public class ClassEx extends AbstractClassEx {

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}
	
	/* ClassEx(10, "java")와 같이 넣으면 AbstractClassEx
	 * 에 있는 num과 str이 초기화됨. 따라서 AbstractClassEx
	 * constructor가 출력되는 것이다.
	 */
	
	
	@Override
	public void fun2() {
		System.out.println(" -- fun2() START -- ");
	}

}
