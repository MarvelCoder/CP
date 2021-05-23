package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW006 {

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		while(n-- >0) {
			
			System.out.printf("%d%n", sum(reader.readLine()));
			
		}
		
	}
	
	public static int sum(String num) {
		
		int n = Integer.parseInt(num);
		int sum = 0;
	
		if(num.length() ==1) {
			sum = n;
		}else {
			for(int i=0;i<num.length();i++) {
				
				sum = sum + n%10;
				n = n/10;
			}			
		}
		return sum;
	}

}
