package Crio.DSA1;

import java.util.Scanner;

public class NthFibonacciNumber {

	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int ans = nthFibonacciNumber(n);
	        System.out.println(ans);
	        sc.close();
	 }

	    static int nthFibonacciNumber(int n){
	    
	        int i=0,j=1;

	        if(n==0)
	            return 0;
	        else if(n==1)
	            return 1;

	        n-=1;

	        return nthFib(n,i,j);
	    }

	    static int nthFib(int n,int i,int j){

	        int k;

	        k=i+j;
	        n--;
	        if(n==0)
	            return k;
	        else
	           return nthFib(n,j,k);
	    }
}
