package num1_10;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class num10 {
	public static void main(String[] args) {
		
	List<String> lst = Arrays.asList("EN","FR","CH","JP");
	Iterator<String> itr = lst.iterator();
	while(itr.hasNext()) {
		String e = itr.next();
		if(e=="CH") {
			break;
		}
		
		System.out.println(e + " ");

		}
	}
}