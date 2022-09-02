package Crio.DSA1;

import java.util.Scanner;

public class FindElement {
	
	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        int x = sc.nextInt();

	        int result = findElement(n, arr, x);

	        System.out.println(result);
	        sc.close();
	    }

	    static int findElement(int n, int[] arr, int x) {

	        //Search the array
	        //find the first occurance of x
	        //Logically this will be the left most one

	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==x) 
	                return i;
	        }
	         return -1;
	    }
}
