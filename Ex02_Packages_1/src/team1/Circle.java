package team1;

public class Circle {

	final double PI = 3.14;
	/*한번 입력받고 더이상 값을 변경할 필요가 없는
	  변수는 final을 넣어 더이상 변경하지 못하도록 하는것이라
	  생각하면 됩니다. */
	
	double rad; // 반지름
	
	public void setRad(double r) {
		rad = r;
	}
	
	// 원의 넓이 반환
	public double getArea() {
		return(rad * rad) * PI;
	}
	
}
