package Crio.DSA1;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbers {

	  // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNumbers(n);

        for (int j : result)
            System.out.print(j + " ");
        
        sc.close();
    }

    static ArrayList<Integer> oddNumbers(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%2!=0)
                list.add(i);
        }
        return list;
    }
    
}
