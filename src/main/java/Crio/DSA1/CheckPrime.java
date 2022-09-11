package Crio.DSA1;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPrime {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int t = sc.nextInt();
	        ArrayList<Integer> nums = new ArrayList<>();

	        for (int i = 0; i < t; i++) {
	            int n = sc.nextInt();
	            nums.add(n);
	        }

	        ArrayList<Boolean> ans = checkPrime(t, nums);

	        for (boolean res : ans) {
	            System.out.println(res);
	        }
	        sc.close();

	    }

	    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {
	    
	        ArrayList<Boolean> list = new ArrayList<>();

	        for(int i=0;i<t;i++){
	            if(nums.get(i) == 0 || nums.get(i) == 1){
	                list.add(false);
	                continue;
	            }
	            int j;
	            for(j=2;j<nums.get(i);j++){
	                if(nums.get(i)%j==0){
	                    list.add(false);
	                    break;
	                }
	            }
	            if(j==nums.get(i))list.add(true);
	        }
	        return list;
	    }
}
