package Class_Project;

public class MainClass {

	public static void main(String[] args) {
		
		Grandeur1 myCar1 = new Grandeur1();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		System.out.println();
		
		Grandeur1 myCar2 = new Grandeur1();
		myCar2.color = "yellow";
		myCar2.gear = "manual";
		myCar2.price = 200;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		System.out.println();
		
		
		Grandeur2 myCar3 = new Grandeur2("blue", 200);
		myCar3.info();
		System.out.println();
		
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "red";
		myBicycle.price = 100;
		myBicycle.info();
		System.out.println();
		
		// 멤버변수(속성) 업데이트
		myBicycle.color = "yellow";
		myBicycle.info();
		
		
	}
}
