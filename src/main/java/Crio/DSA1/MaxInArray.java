package Crio.DSA1;

import java.util.Scanner;

public class MaxInArray {

	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        int result = maxInArray(n, arr);
	        System.out.println(result);
	        
	        sc.close();
	    }

	    static int maxInArray(int n, int[] arr) {

	        //Take a max variable to hold max value
	        //loop picks each element for comparision with max
	        //Keep replacing max when maximum value is found

	        int max = 0;

	        for(int i=0;i<arr.length;i++){
	            if(arr[i] > max) max = arr[i];
	        }
	        return max;
	    }
}
