package Crio.DSA1;

import java.util.Scanner;

public class FindQuadrant {

	 public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        float x = sc.nextFloat();
	        float y = sc.nextFloat();

	        int result = findQuadrant(x, y);
	        System.out.println(result);
	        sc.close();
	    }

	    static int findQuadrant(float x, float y) {
	        
	        if(x>0 && y>0)
	            return 1;
	        else if(x<0 && y>0)
	            return 2;
	        else if(x<0 && y<0)
	            return 3;
	        else if(x>0 && y<0)
	            return 4;

	        return 0;
	    }
}
