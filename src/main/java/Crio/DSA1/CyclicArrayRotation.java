package Crio.DSA1;

import java.util.Scanner;

public class CyclicArrayRotation {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int k = sc.nextInt();

	        int rotatedArr[] = cyclicRotation(n, arr, k);

	        for (int j : rotatedArr)
	            System.out.print(j + " ");

	        sc.close();
	    }

	    static int[] cyclicRotation(int n, int[] arr, int k) {
	    
	        int[] a = new int[k]; 

	        int temp;

	        for(int i=0;i<a.length;i++){
	            temp = arr[arr.length-1];
	            for(int j=arr.length-1;j>0;j--)
	                arr[j] = arr[j-1];
	                
	            arr[0] = temp;
	        }

	        return arr;    
	    }

}
