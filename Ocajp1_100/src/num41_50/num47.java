package num41_50;

class Vehicle{
	int x;
	Vehicle(){
		this(10);	// Vehicle(int x)에 10을 넣어서 호출함
	}
	Vehicle(int x){
		this.x = x;
	}
}

class Car extends Vehicle{
	int y;
	Car(){
		super(10);
	}
	Car(int y){
		super(y);
		this.y = y;
	}
	
	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class num47 {
	
	public static void main(String[] args) {
		
		Vehicle y = new Car(20);
		System.out.println(y);
	}
	
}
