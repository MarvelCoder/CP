package Crio.DSA1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReduceArray {
	
	   public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int a[] = new int[n];

	        for(int i=0;i<n;i++) {
	            a[i] = Integer.parseInt(sc.next());
	        }

	        int ans = reduceArray(n, a);
	        System.out.println(ans);
	        sc.close();
	    }

	    static int reduceArray(int n, int a[]){

	    PriorityQueue<Integer> heap = new
	    PriorityQueue<>(Collections.reverseOrder());
	     
	    for(int i = 0; i < n; i++)
	    {
	       heap.offer(a[i]);
	    }
	     
	    while (heap.size() != 1)
	    {
	        int X = heap.poll();
	         
	        int Y = heap.poll();
	        
            int diff = Math.abs(X - Y);
            
            heap.offer(diff);
	       
	    }

	    return heap.poll();
	    }

}
