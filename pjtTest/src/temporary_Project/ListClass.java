package temporary_Project;

import java.util.ArrayList;

public class ListClass {

	public static void main(String[] args) {
		
		ArrayList<String> Taewoong = new ArrayList ();
		
		Taewoong.add("Hello");
		Taewoong.add("Java");
		Taewoong.add("World");
		
		System.out.println(Taewoong);
		
		System.out.println("list size : " + Taewoong.size());
		Taewoong.add(2, "Programming");
		System.out.println(Taewoong);
		
		Taewoong.set(1, "C");
		System.out.println(Taewoong);
		
		System.out.println(Taewoong.get(1));
		
		Taewoong.remove(2);
		System.out.println(Taewoong);
		
		Taewoong.clear();
		System.out.println(Taewoong.isEmpty());
	}
}
