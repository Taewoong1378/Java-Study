package Interface_Project;

public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD {
// ���߻���� �ȵ����� �������̽��� �������� ������ �� ����
	
	public ImplementClass() {
		System.out.println("ImplementClass constructor");
	}

	@Override
	public void funD() {
		System.out.println(" -- funD START --");
	}

	@Override
	public void funC() {
		System.out.println(" -- funD START --");
	}

	@Override
	public void funB() {
		System.out.println(" -- funB START --");
	}

	@Override
	public void funA() {
		System.out.println(" -- funA START --");
	}
}
