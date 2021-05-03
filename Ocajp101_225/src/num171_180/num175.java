package num171_180;

import java.util.Arrays;

public class num175 {

	public static void main(String[] args) {
		
		int num[][] = new int[3][1];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = 10;
			}
		}
		
		num[0][0]=10;
		num[1][0]=10;
		num[2][0]=10;
		
		System.out.println(Arrays.toString(num[0]));
		System.out.println(Arrays.toString(num[1]));
		System.out.println(Arrays.toString(num[2]));
	}
}
