package Crio.DSA1;

import java.util.Scanner;

public class CountVowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
        sc.close();
    }

    static int countVowels(String str) {

        //loop through string and check each character is in a,e,i,o,u
        //increase counter when match
        int counter=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') counter++;
        }
        return counter;
    }

}
