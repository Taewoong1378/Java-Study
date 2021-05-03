package temporary_Project;

public class EmployeeBank {

	String name;
	static int amount;
	
	public EmployeeBank(String n) {
		System.out.println("BankSystem Start!");
		this.name = n;
	}
	
	public void savemoney(int i) {
		amount = amount + i;
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}
	
	public void usedmoney(int i) {
		amount = amount - i;
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}
	
}
