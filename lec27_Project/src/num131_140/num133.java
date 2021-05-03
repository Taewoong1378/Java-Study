package num131_140;

import java.util.List;
import java.util.ArrayList;

class Patient {
	String name;
	public Patient(String name) {
		this.name = name;
	}
}

public class num133 {
	public static void main(String[] args) {
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		
		int f = ps.indexOf(p2);
		if(f>=0) {
			System.out.println("Mike Found");
		}
	}
}
