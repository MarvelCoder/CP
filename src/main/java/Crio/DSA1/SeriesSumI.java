package Crio.DSA1;

import java.util.Scanner;

public class SeriesSumI {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int result = seriesSumI(n);

	        System.out.println(result);
	        sc.close();
	    }

	    static int seriesSumI(int n) {

	         return (n*(4*n*n+6*n-1)/3);
	    }
}
