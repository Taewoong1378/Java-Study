package num41_50;

class Vehicles{
	int x;
	Vehicles(){
		this(10);	// Vehicle(int x)�� 10�� �־ ȣ����
	}
	Vehicles(int x){
		this.x = x;
	}
}

class Cars extends Vehicles{
	int y;
	Cars(){
		super();
//		this(20);
	}
	Cars(int y){
		this.y = y;
	}
	
	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class num47_1 {
	
	public static void main(String[] args) {
		
		Vehicle y = new Car(20);
		System.out.println(y);
	}
	
}
