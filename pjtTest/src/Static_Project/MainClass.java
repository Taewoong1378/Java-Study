package Static_Project;

import Static_Project.EmployeeBank;


public class MainClass {

	public static void main(String[] args) {
		
		EmployeeBank parkBank = new EmployeeBank("����ȣ");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("�̽¿�");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo();
		
		
	}
	
}
