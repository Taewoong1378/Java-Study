package num111_120;

class Employee {
	public int salary;
}

class Manager extends Employee {
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
}

public class num114 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		
//		director.stockOptions=1_000;
		employee.salary = 50_000;
//		manager.budget=1_000_000;
//		manager.stockOptions = 500;
//		employee.budget = 200_000;
		director.salary = 80_000;
	}
}
