/**
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. 
The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words.
Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"



Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
 */
package conceptCoding;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author sanjit
 *
 */
public class ReverseWordsinString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "the sky is blue";
		s = reverseWords(s);
		System.out.println(s);

	}
	
	//Using stack and not in built split function
	private static String reverseWords(String s) {
		Stack<String> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && sb.length() == 0) {
				sb = new StringBuffer();
			} else if (s.charAt(i) == ' ' && sb.length() > 0) {
				stack.add(sb.toString());
				sb = new StringBuffer();
			} else if (s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
			}
		}
        if(sb.length()>0){
        	stack.push(sb.toString());
        	sb= new StringBuffer();
        }
		while (stack.isEmpty() == false) {
			sb.append(stack.pop()).append(" ");
		}
		return sb.toString().trim();
	}
	
	
	//using Auxillary Space
	/*private static String reverseWords(String s) {
		StringBuffer sb = new StringBuffer();
		s= s.trim();
		String arr[] = s.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i].isEmpty()==false){
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.toString().trim();
	}*/
	

	private static String reverse(char s[], int startIndex, int endIndex) {
     
      while(startIndex < endIndex){
    	  char temp = s[startIndex];
    	  s[startIndex]= s[endIndex];
    	  s[endIndex] = temp;
    	  startIndex++;
    	  endIndex--;
      }
      return String.valueOf(s);
		
	}

}
