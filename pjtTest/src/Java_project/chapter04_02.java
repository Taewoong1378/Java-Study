package Java_project;

public class chapter04_02 {
	
	public static void main(String[] args) {
	
		byte by = 10;
		int in = by;
		System.out.println("in = " +in);
		
		
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " +bVar);
		
		
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " +bVar);
	}
}


