package Inheritance2_Project;

public class MainClass {

	public static void main(String[] args) {
		
		// �޼��� �������̵�(Override)
		ChildClass child = new ChildClass();
		child.makeJJajang();
		
		System.out.println();
		
		// ��ü ����
		// FirstChildClass fch = new FirstChildClass();
		// SecondChildClass sch = new SecondChildClass();
		// �Ʒ��� ���� �ǹ��̴�. ParentClass�� ��ӹް� �ֱ� ����!
		
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		// �⺻ �ڷ���ó�� Ŭ������ �ڷ������� ����Ѵ�.
		
		/* ������ FirstChildClass�� SecondChildClass��
		�ٸ� Ŭ�����ӿ��� �ұ��ϰ� ParentClass�� ���
		�ޱ� ������ ������Ÿ���� ���Ͻ����� �� �ִ�.
		���� ���� �迭�� �־��� �� �ִ�! (�Ʒ�) */
		
		// �ڷ���(Ÿ��) - �迭 ����
		// ParentClass pArr [] = new ParentClass[2];
		// �̷��� ���� ��
		
		ParentClass [] pArr = new ParentClass[2];
		pArr[0] = fch;
		pArr[1] = sch;
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].makeJJajang();
		}
		
		System.out.println();
		
		// Object Ŭ����
		Object objs[] = new Object[2];
		objs[0] = new FirstChildClass();
		objs[1] = new SecondChildClass();
		
		for (int i = 0; i < objs.length; i++) {
//			objs[i].makeJJajang();
			
			if(i == 0) {
				((FirstChildClass)objs[i]).makeJJajang();
			} else {
				((SecondChildClass)objs[i]).makeJJajang();
			}
		}
		
		System.out.println();
		
		// super
		ChildClass c = new ChildClass();
		c.getOpenYear();
	}
	
}
