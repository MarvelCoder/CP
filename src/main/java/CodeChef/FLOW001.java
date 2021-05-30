package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW001 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[] arr = new int[n];
		
		int i=0;
		
		while(n-- > 0) {
			String[] narr = reader.readLine().split("\\s");
			arr[i] = Integer.parseInt(narr[0]) + Integer.parseInt(narr[1]);
			i++;
		}
		
		for(int a:arr)
			System.out.printf("%d%n", a);
	}

}
