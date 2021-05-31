package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int w = Integer.parseInt(reader.readLine());
		
		if( w-2 >= 2 && (w-2)%2==0)
			System.out.printf("%s", "YES");
		else
			System.out.printf("%s", "NO");
		
		reader.close();
		
	}

}
