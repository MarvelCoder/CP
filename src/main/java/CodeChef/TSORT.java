package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TSORT {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		
		int[] arr = new int[num];
		
		int i=0;
		
		while(num-- > 0) {
			
			arr[i] = Integer.parseInt(reader.readLine());
			i++;
		}

		Arrays.sort(arr);
		
		System.out.printf("%s%n", Arrays.toString(arr));
	}

}
