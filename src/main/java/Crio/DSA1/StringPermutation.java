package Crio.DSA1;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int permutation[] = new int[n];

        for (int i = 0; i < n; i++)
            permutation[i] = sc.nextInt();

        String result = stringPermutation(n, str, permutation);

        System.out.println(result);
        sc.close();
    }

    static String stringPermutation(int n, String str, int[] permutation) {
        
        //convert string to char array
        //loop through the array and start finding position 1 to n-1
        //once found, move that character to new place in new string

        String newStr="";
        char[] ch = str.toCharArray();

        for(int i=1;i<=permutation.length;i++){
            for(int j=0;j<permutation.length;j++){
                if(permutation[j]==i){
                    newStr+=ch[j];
                }
            }
        }
        return newStr;
 
    }
}
