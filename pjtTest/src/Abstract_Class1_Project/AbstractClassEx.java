package Abstract_Class1_Project;

public abstract class AbstractClassEx {
	// class �տ� abstract �ٿ��ֱ�
	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println(" -- fun1() START -- ");
	}
	
	public abstract void fun2();
	
	// �޼ҵ尡 ���� ���ְ� ���ǵ����� �ʴ�.
	// ����ϰ� �ִ� Ŭ�������� �ݵ�� ������ �������
	// �� �κ��� �������̽��� ����
}
