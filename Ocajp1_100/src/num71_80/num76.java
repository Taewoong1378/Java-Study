package num71_80;

public class num76 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException{	// line n1
		System.out.println("Checking card");
	}
	
	public static void main(String[] args) {
		num76 ex = new num76();
		int cardNo = 12344;
//	ex.readCard(cardNo);	// line n2
		ex.checkCard(cardNo);	// line n3
	}
}
