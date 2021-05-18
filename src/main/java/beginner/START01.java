package beginner;

import java.util.Scanner;

public class START01 {

	public static void main (String[] args)
	{
	    Scanner stdin = new Scanner(System.in);

		if (stdin.hasNextInt()) {
			System.out.println(stdin.nextInt());
		}

		stdin.close();
	}
	
}
