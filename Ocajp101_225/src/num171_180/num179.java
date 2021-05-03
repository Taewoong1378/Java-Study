package num171_180;

class Employee{
	public int salary;
}

class Manager extends Employee{
	public int budget;
}

class Director extends Manager{
	public int stockOptions;
}

public class num179 {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		
//		employee.budget=1_000_000;
//		manager.stockOptions=500;
		
		employee.salary=50_000;
		director.salary=80_000;
		manager.budget=1_000_000;
	}
}
