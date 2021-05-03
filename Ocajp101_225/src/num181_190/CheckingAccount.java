package num181_190;

public class CheckingAccount {
	public int amount;
	public CheckingAccount(int amount) {
		this.amount = amount;
	}
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	public void changeAmount(int x) {
		amount += x;
	}
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
//A		acct.setAmount(-acct.getAmount());	// -509
//B		acct.amount=0;						// 0
//C		acct.setAmount(0);					// 0
//D		acct.getAmount()=0;					// 에러?
//E		this.amount = 0;					// 에러
//F		acct.changeAmount(0);				// 에러
//G		acct.changeAmount(-acct.amount);	// 0
	
		System.out.println(acct.getAmount());
	}
}
