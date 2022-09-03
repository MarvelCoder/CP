package Crio.DSA1;

import java.util.Scanner;

public class CheckMagicSquare {

	
	  // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);
        
        sc.close();

    }
    static String checkMagicSquare(int n, int[][] grid) {

        //first traverse through rows and sum each row
        //second traverse through cols and sum each col
        //third traverse through forward diagonal and sum each element

        int temp = 0,diagsum=0;
        int[] arr = new int[n];
        String str = "No";

         for(int k=0;k<grid.length;k++){
            diagsum+=grid[k][k];
        }

        for(int i=0;i<n;i++){
            for(int row=0;row<grid.length;row++){
                temp+=grid[row][i];
            }
            if(diagsum==temp){
                arr[i]=temp;
                temp=0;
            }else{
                break;
            }
        }

       if(isArrayElementsEqual(arr))str = "Yes";
       else return "No";

        for(int j=0;j<n;j++){
            for(int col=0;col<grid[0].length;col++){
                temp+=grid[j][col];
            }
            if(diagsum==temp){
                arr[j]=temp;
                temp=0;
            }else{
                break;
            }
        }

       if(isArrayElementsEqual(arr))str = "Yes";
       else return "No";


       return str;
    }

     static boolean isArrayElementsEqual(int[] arr){

         for(int x=1;x<arr.length;x++){
             if(arr[0]!=arr[x])
                return false;
         }
        return true;
     }
}
