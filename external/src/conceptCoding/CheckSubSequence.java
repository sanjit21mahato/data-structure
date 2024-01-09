/**
 Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting 
some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters. 
 */
package conceptCoding;

/**
 * @author sanjit
 *
 */
public class CheckSubSequence {

	
	public static void main(String[] args) {
		String t = "ahbgdc";
		String s="axc";
		boolean isSubsequence = checkSubsequence(t,s);
		System.out.println(isSubsequence);

	}

	private static boolean checkSubsequence(String t, String s) {
		
		int i=0,j=0;
		while(i<t.length() && j<s.length()){
			if(t.charAt(i)==s.charAt(j)){
				i++;
				j++;
			}else{
				i++;
			}
		}
		
		return j==s.length();
	}

}
