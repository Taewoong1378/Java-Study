package num151_160;

public class CheckingAccount {
	
	public int amount;
	// line n2
	public CheckingAccount() {
		amount = 100;
	}

	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		// line n2
		System.out.println(acct.amount);
	}
}
