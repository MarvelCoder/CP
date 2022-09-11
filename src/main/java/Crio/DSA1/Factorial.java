package Crio.DSA1;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);
        sc.close();
	}

    static int factorial(int n) {

        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);

    }
}
