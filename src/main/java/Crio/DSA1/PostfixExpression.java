package Crio.DSA1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String exp = sc.nextLine();

	        int val = postfixExpression(exp);
	        System.out.println(val);
	        sc.close();
	    }

	 static int postfixExpression(String exp) {
		 
		char[] expression = exp.toCharArray();
		 
		Stack<Integer> st=new Stack<>();

        int i = 0;
        while (i < expression.length){
            char c = expression[i];

            if (c == ' '){
                i++;
                continue;
            }
            else if (c >= '0' && c <= '9'){

                int val = 0;
                while (i<expression.length){
                	if(expression[i]!=' ') {
	                    int temp = (int)(expression[i] - '0');
	
	                    val = 10 * val + temp;

	                    i++;
                	}
                }

                st.push(val);
            }
            else{

                if (st.size() < 2){
                    System.out.println("Given expression is invalid");
                    return Integer.MIN_VALUE;
                }
                int op1 = st.pop();
                int op2 = st.pop();

                switch(c){
                    case '+':
                        st.push(op2 + op1);
                        break;
                    case '-':
                        st.push(op2 - op1);
                        break;
                    case '*':
                        st.push(op2 * op1);
                        break;    
                    case '/':
                        st.push(op2 / op1);
                        break;
                }
            }
            i++;
        }
        
        return st.peek();
    }
}
