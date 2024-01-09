/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class CheckIfStringIsPalindrome_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s= "abccfba";
		boolean isPalindrome = checkPalindrome(s, 0, s.length()-1);
		System.out.println(isPalindrome);

	}

	private static boolean checkPalindrome(String s, int left, int right) {
		if(left>right){
			return true;
		}
		if(s.charAt(left)!=s.charAt(right)){
			return false;
		}
		return checkPalindrome(s, left+1, right-1);
		
	}

}
