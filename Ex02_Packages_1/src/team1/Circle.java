package team1;

public class Circle {

	final double PI = 3.14;
	/*�ѹ� �Է¹ް� ���̻� ���� ������ �ʿ䰡 ����
	  ������ final�� �־� ���̻� �������� ���ϵ��� �ϴ°��̶�
	  �����ϸ� �˴ϴ�. */
	
	double rad; // ������
	
	public void setRad(double r) {
		rad = r;
	}
	
	// ���� ���� ��ȯ
	public double getArea() {
		return(rad * rad) * PI;
	}
	
}
