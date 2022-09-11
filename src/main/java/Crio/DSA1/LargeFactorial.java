package Crio.DSA1;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

	 public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int ans[] = largeFactorial(n);
	        for (int j : ans)
	            System.out.print(j);
	        sc.close();

	    }

	 		static int[] largeFactorial(int n) {

	        BigInteger big = new BigInteger("1");
	 
	        for(int i=2; i<=n; i++)
	            big = big.multiply(BigInteger.valueOf(i));
	 
	        String str = big.toString();

	        int[] arr = new int[str.length()];
	        
	        for(int i=0;i<arr.length;i++)
	            arr[i] = str.charAt(i)-'0';

	        return arr;
	    }

}
