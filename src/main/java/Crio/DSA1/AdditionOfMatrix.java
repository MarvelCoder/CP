package Crio.DSA1;

import java.util.Scanner;

public class AdditionOfMatrix {

	  // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int gridOne[][] = new int[n][m];
        int gridTwo[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                gridOne[i][j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                gridTwo[i][j] = sc.nextInt();
        }

        int[][] result = additionOfMatrix(n, m, gridOne, gridTwo);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
    
    static int[][] additionOfMatrix(int n, int m, int[][] gridOne, int[][] gridTwo) {

        //init loop for row from 0 to n
        //init loop for column from 0 to m
        // sum the elements at each position across matrices

        int[][] result = new int[n][m];

        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                result[row][col]=gridOne[row][col]  + gridTwo[row][col];
            }
        }
        return result;
    }
}
