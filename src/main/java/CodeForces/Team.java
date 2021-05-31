package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		
		int sum =0,count=0;
		
		while(n-- > 0) {
			sum=0;
			char[] ch = reader.readLine().toCharArray();
			
			for(char c:ch)
				if(c != ' ')
					sum += Character.getNumericValue(c);
			
			if(sum >= 2)count++;
		}
		System.out.printf("%d",count);
	}
	
}
