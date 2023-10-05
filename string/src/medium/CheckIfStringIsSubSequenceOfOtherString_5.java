/*
I/P: s1 =  "ABCD"
	 s2 = "AD"

O/P : true
	 
I/P : s1 = "ABCDE"
      s2 ="AED"

O/P:false*

If there are n characters then total subsequences would be 2 to power n
there is difference between subsequence and substring
substring means contiguous characters
AD is subsequence but not substring
*/
package medium;

/**
 * @author sanjit
 *
 */
public class CheckIfStringIsSubSequenceOfOtherString_5 {

	public static void main(String[] args) {
		String s1= "ABCD";
		String s2= "AD";
		boolean isSubSequence = checkForSubsequence(s1,s2);
		System.out.println(isSubSequence);
		
	}

	private static boolean checkForSubsequence(String s1, String s2) {
		
		int n = s1.length();
		int m = s2.length();
		int i=0;
		int j=0;
		while(i<n && j<m){
			if(s2.charAt(j)==s1.charAt(i)){
				i++;
				j++;
			}else{
				i++;
			}
		}
		/*int j=0;
		for(int i=0; i<n &&j< m;i++ ){
			if(s1.charAt(i)==s2.charAt(j)){
				j++;
			}
		}*/
		return (j==m);
	}
	

}
