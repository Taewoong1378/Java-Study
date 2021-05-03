package num11_20;

public class num18 {

	public static void main(String[] args) {
		
		String[] arr = {"A","B","C","D"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
			if(arr[i].equals("C")){
				continue;
			}
			
			System.out.println("Work done");
			break;
		}
	}
}
