package Crio.DSA1;

import java.util.Scanner;

public class NumberOfPrimesInRange {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int l = sc.nextInt();
	        int r = sc.nextInt();
	        int ans = numberOfPrimesInARange(l, r);
	        System.out.println(ans);
	        sc.close();
	 }

	    static int numberOfPrimesInARange(int l, int r) {

	        int count=0;
	        boolean flag = false;

	        for(int i=l;i<=r;i++){
	            flag=false;
	            if(i==0 || i==1)
	                continue;
	            for(int j=2;j<i;j++){
	                if(i%j==0){
	                    flag=true;
	                    break;
	                }
	            }
	            if(!flag)count++;
	        
	        }
	        return count;
	    }

}
