package Crio.DSA1;

import java.util.Scanner;

public class PyramidPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);
        sc.close();
    }

    static String[] pyramidPrinting(int n) {

        String [] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i]="";
            for(int j=0;j<=i;j++){
                arr[i]+="* ";
            }
        }
        return arr;
    }
}
