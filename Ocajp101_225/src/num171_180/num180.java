package num171_180;

import java.util.ArrayList;

public class num180 {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch(RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		}
		System.out.println("Ready to use");
	}
}
