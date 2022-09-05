package Crio.DSA1;

import java.util.Scanner;

public class Capitalise {

	  // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
        sc.close();
        
    }

    static String capitalise(String str) {

        String ans ="";

        ans+=Character.toUpperCase(str.charAt(0));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                 ans+=str.charAt(i);
                ans+=Character.toUpperCase(str.charAt(i+1));
                i++;
            }else
                ans+=str.charAt(i);
        }
        return ans;
    }
}
