package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW002 {

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(reader.readLine());
		
		while(n-- > 0) {
			
			String[] str = reader.readLine().split("\\s");
			
			System.out.printf("%d%n", Integer.parseInt(str[0])%Integer.parseInt(str[1]));
		}
		
	}

}
