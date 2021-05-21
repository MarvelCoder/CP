package beginner;

import java.util.Scanner;

public class INTEST {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
			
		int counter=0;
		
		long num1 = stdin.nextLong();
		
		long num2 = stdin.nextLong();
		
		for(int i=0;i<num1;i++) {
			
			long num3 = stdin.nextLong();
			
			if(num3%num2==0) counter++;
			
		}
		
		System.out.printf("%d", counter);
		
		stdin.close();
		
	}
}