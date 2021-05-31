package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		int n = Integer.parseInt(reader.readLine());
		
		while(n-- > 0) {
			
			String str = reader.readLine();
			
			if(str.length() > 10) {
				char ch[] = str.toCharArray();
				System.out.printf("%c%d%c%n", ch[0],ch.length-2,ch[ch.length-1]);
				
			}else
				System.out.printf("%s%n",str);
			
		}
		
	}
}
