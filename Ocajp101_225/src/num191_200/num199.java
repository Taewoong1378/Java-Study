package num191_200;

abstract class Vehicle{
	public void start(){
		System.out.println("start");
	}
	
	public void run() {
		System.out.println("run");
	}
	
	abstract void ride();
}

class Bus extends Vehicle{
	
	@Override
	void ride() {
		System.out.println("ride Bus");
		
	}
	
}

public class num199 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.ride();
		bus.run();	
	}
}
