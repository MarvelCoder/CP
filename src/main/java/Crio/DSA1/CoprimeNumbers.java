package Crio.DSA1;

import java.util.Scanner;

public class CoprimeNumbers {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int result = coprimeNumbers(n);

	        System.out.println(result);
	        sc.close();
	    }

	    static int coprimeNumbers(int n) {
	    
	        int count=0;

	        for(int i=1;i<=n;i++){
	            if(gcd(i,n)==1)count++;
	        }
	        return count;
	    }

	    static int gcd(int i,int j){

	        if(i==0)return j;

	        return gcd(j%i,i);
	    }
	
}
