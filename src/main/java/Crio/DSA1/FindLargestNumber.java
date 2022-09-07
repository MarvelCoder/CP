package Crio.DSA1;

import java.util.Scanner;

public class FindLargestNumber {

	  // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float result = findLargestNumber(a, b, c);

        if (result - (int) result == 0.0)
            System.out.println((int) result);
        else
            System.out.println(result);
        sc.close();
    }
    static float findLargestNumber(float a, float b, float c) {

        if(a>b){
            if(a>c)return a;
            else return c;
         } else{ 
            if(b>c)return b;
            else return c;   
        }
    }
	
}
