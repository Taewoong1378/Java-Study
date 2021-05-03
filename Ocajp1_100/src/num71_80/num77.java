package num71_80;

import java.util.ArrayList;
import java.util.List;

class PProduct {
	int id;
	String name;
	PProduct(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class num77 {
	public static void main(String[] args) {
		List<PProduct> lst = new ArrayList<>();
		lst.add(new PProduct(10, "IceCream"));
		lst.add(new PProduct(11, "Chocolate"));
		PProduct p1 = new PProduct(10, "IceCream");
		System.out.println(lst.indexOf(p1));
	}
}
