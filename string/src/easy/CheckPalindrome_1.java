package easy;

/**
 * @author sanjit
 *
 */
public class CheckPalindrome_1 {

	
	public static void main(String[] args) {
		String str = "abcecba";
		boolean isPalidrome= checkPalindrome(str);
        System.out.println(isPalidrome);
	}

	private static boolean checkPalindrome(String str) {
       int left= 0;
       int right= str.length()-1;
       
       while(left<right){
    	   if(str.charAt(left)!=str.charAt(right)){
    		   return false;
    	   }
    	   left++;
    	   right--;
       }
 
		return true;
	}

}
