package Abstract_Class1_Project;

public class ClassEx extends AbstractClassEx {

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}
	
	/* ClassEx(10, "java")�� ���� ������ AbstractClassEx
	 * �� �ִ� num�� str�� �ʱ�ȭ��. ���� AbstractClassEx
	 * constructor�� ��µǴ� ���̴�.
	 */
	
	
	@Override
	public void fun2() {
		System.out.println(" -- fun2() START -- ");
	}

}
