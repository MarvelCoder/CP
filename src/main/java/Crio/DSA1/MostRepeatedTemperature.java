package Crio.DSA1;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MostRepeatedTemperature {

	   public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int a[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            a[i] = Integer.parseInt(sc.next());
	        }

	        int ans = mostRepeatedTemperature(n, a);
	        System.out.println(ans);
	        sc.close();
	   }

	    static int mostRepeatedTemperature(int n, int a[]) {

	    	TreeMap<Integer,Integer> map = new TreeMap<>();

	        for(int i=0;i<a.length;i++){
	            if(map.containsKey(a[i])){
	                map.put(a[i],map.get(a[i])+1);
	            }else{
	                map.put(a[i],1);
	            }
	        }
	  System.out.println(map);
	      Set<Entry<Integer, Integer>> entrySet = map.entrySet();

	        int maxCount = 0;
	        int maxTemp = 0;

	        for(Entry<Integer, Integer> entry : entrySet)
	        {
	        	 if(entry.getValue() >= maxCount)
	             {
	                 maxTemp = entry.getKey();
	                 maxCount = entry.getValue();
	        	}
	         }
	         return maxTemp;
	    }
}
