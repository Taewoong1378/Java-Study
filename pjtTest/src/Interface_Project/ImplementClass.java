package Interface_Project;

public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD {
// 다중상속은 안되지만 인터페이스는 여러개를 구현할 수 있음
	
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
