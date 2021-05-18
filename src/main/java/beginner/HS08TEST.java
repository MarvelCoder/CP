package beginner;

import java.util.Scanner;

public class HS08TEST{

 public static void main(String[] a){
 
 	Scanner stdin = new Scanner(System.in);
 
 	int withdraw = stdin.nextInt();
 	double balance = stdin.nextDouble();
 	
 	if(balance < withdraw+0.50 || withdraw%5!=0)System.out.printf("%.2f",balance);
 	else System.out.printf("%.2f",balance-withdraw-0.50);	
 	stdin.close();
 	
 }
}