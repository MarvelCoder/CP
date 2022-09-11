package Crio.DSA1;

import java.util.Scanner;

public class GradingSystem {

	   public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);

	        float marks = sc.nextFloat();
	        String result = gradingSystem(marks);

	        System.out.println(result);
	        
	        sc.close();
	    }

	    static String gradingSystem(float marks) {

	        if(marks>=0 || marks<=25)
	            return "F";
	        else if(marks>25 || marks<=45)
	            return "E";
	        else if(marks>45 || marks<=50)
	            return "D";
	        else if(marks>50 || marks<=60)
	            return "C";
	        else if(marks>60 || marks<=80)
	            return "B";
	        else if(marks>80 || marks<=100)
	            return "A";
	        else
	            return "Invalid";
	    }
}
