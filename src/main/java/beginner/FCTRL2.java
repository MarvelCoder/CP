package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL2 {

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		while(n-- >0) {
			
			System.out.printf("%s%n", factorial(reader.readLine()));
			
		}
		
	}
	
	public static String factorial(String n) {
		
		BigInteger big = new BigInteger(n);
		
		BigInteger fact = new BigInteger(n);

		if(Integer.parseInt(n) <= 1)
			return "1";
		else {
			do {
				big = big.subtract(BigInteger.ONE);	
				fact = fact.multiply(big);

			}while(big.intValueExact() >= 2);			
			return fact.toString();
		}
	}

}
