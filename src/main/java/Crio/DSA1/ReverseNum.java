package Crio.DSA1;

import java.util.Scanner;

public class ReverseNum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);
        sc.close();

    }


    static int reverseNum(int num) {

       //Take out each digit starting from lsb to msb
       //Take this digit and add it to reversenumber * 10
       //Keep looping until num becomes zero

         int revNum =0;
         int digit = 0;

         while(num!=0){
             digit = num%10;
             revNum = revNum * 10 + digit;
             num = num/10;
         }  
         return revNum;

         //Convert the num to string
         //Extract char array from string
         //Loop in reverse and store each char
         //Convert the string to num
         
//        char ch[] = Integer.toString(num).toCharArray();
//
//        String str = "";
//
//        for(int i=ch.length-1;i>=0;i--)
//            str+= ch[i];
//
//        return Integer.parseInt(str);    
    }
}

