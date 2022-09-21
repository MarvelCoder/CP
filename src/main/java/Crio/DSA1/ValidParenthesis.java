package Crio.DSA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParenthesis {
	
  public String isValid(String s) {
	  
	int n = s.length();
	Stack<Character> stack = new Stack<>();
	for(int i = 0; i < n; i++) {
		if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
			stack.push(s.charAt(i));
		} 
		else {
			if (stack.empty()) {
				return "false";
			}
			if (s.charAt(i) == ')') {
				char last = stack.peek();
				stack.pop();
				if (last != '(') {
					return "false";
				}
			}
			if (s.charAt(i) == '}') {
				char last = stack.peek();
				stack.pop();
				if (last != '{') {
					return "false";
				}
			}
			if (s.charAt(i) == ']') {
				char last = stack.peek();
				stack.pop();
				if (last != '[') {
					return "false";
				}
			}
		}
	}
		if(stack.isEmpty())
			return "true";
		else
			return "false";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }

}
