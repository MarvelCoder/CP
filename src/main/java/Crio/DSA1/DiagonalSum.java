package Crio.DSA1;

import java.util.Scanner;

public class DiagonalSum {
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
        sc.close();
    }

    static int diagonalSum(int n, int[][] a) {

        //init for loop
        //loop will increment fow row and column both
        //take sum variable = 0

        int sum = 0;

        for(int i=0;i<a.length;i++) sum+=a[i][i];

        return sum;
    }
}
