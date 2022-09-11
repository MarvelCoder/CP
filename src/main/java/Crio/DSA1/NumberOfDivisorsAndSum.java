package Crio.DSA1;

import java.util.Scanner;

public class NumberOfDivisorsAndSum {

	   public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int ans[] = numberOfDivisorsAndSum(n);
	        System.out.println(ans[0] + " " + ans[1]);
	        sc.close();
	    }

	    static int[] numberOfDivisorsAndSum(int n){

	        int[] arr = new int[2];

	        int count,sum;
	        count=sum=0;

	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                sum+=i;
	                count++;
	            }
	        }
	        arr[0] = count;
	        arr[1] = sum;

	        return arr;
	    }
}
