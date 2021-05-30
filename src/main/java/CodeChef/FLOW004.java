package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW004 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int itr = Integer.parseInt(reader.readLine());
		
		while(itr-- > 0) {
			String number = reader.readLine();
			
			System.out.printf("%d%n", Integer.parseInt(String.valueOf(number.charAt(0)))+Integer.parseInt(String.valueOf(number.charAt(number.length()-1))));
	
		}	
	}
}