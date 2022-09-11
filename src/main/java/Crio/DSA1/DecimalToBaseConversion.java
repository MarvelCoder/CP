package Crio.DSA1;

import java.util.Scanner;

public class DecimalToBaseConversion {

	 public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int b = sc.nextInt();

	        String result = decimalToBaseConversion(n, b);
	        System.out.println(result);
	        sc.close();
	    }

	    static String decimalToBaseConversion(int n, int b) {

	        String s = "";
	 
	        while (n > 0)
	        {
	            s += reVal(n % b);
	            n /= b;
	        }
	        StringBuilder str = new StringBuilder();

	        str.append(s);

	        return new String(str.reverse());
	    }

	    static char reVal(int n)
	    {
		    if (n >= 0 && n <= 9)
		        return (char)(n + 48);
		    else
		        return (char)(n - 10 + 65);
	    }
}
