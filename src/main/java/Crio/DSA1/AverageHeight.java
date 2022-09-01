package Crio.DSA1;

import java.util.Scanner;

public class AverageHeight {

	   public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        float a[] = new float[n];

	        for(int i = 0; i < n; i++)
	        {
	            a[i] = Float.parseFloat(sc.next());
	        }

	        float avgHeight = averageHeight(n, a);
	        System.out.println(avgHeight);
	        sc.close();
	    }

	    static float averageHeight(int n, float[] a){
	    //loop through array and sum all heights
	    //divide above sum with n to find average height

	    float sum=0;

	    for(int i = 0;i<a.length;i++)
	        sum +=a[i];

	    return sum/n;
	    }

}
