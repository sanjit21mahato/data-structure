package medium;

import java.util.ArrayDeque;
import java.util.Stack;

/*Six possible characters in input string 
[, {, (,), }, ]

Check if opening brackets are clsoed in order

I/P: str = "([])"
O/P : yes

I/P: str ="((())"
O/P: No

I/P: st ="([)]"
O/P: No*/

public class BalancedParanthesisProblem_5 {

	public static void main(String[] args) {
		String s = "{(())}";
		boolean isBalanced =true;
		 isBalanced = checkBalancedParanthesis(s);
		System.out.println(isBalanced);

	}

	private static boolean checkBalancedParanthesis(String s) {
		//Stack<Character>stack = new Stack<>();
		//There is difference between push and add method of ArrayDeque
		ArrayDeque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()){
					return false;
				}
				char c = stack.pop();
				if (s.charAt(i) == ')' && c != '(') {
					return false;
				} else if (s.charAt(i) == '}' && c != '{') {
					return false;
				}
				if (s.charAt(i) == ']' && c != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

}
