/*
Str: ABC
O/P: "", C, B, BC, A, AC, AB, ABC
*
Substring/subarray means need to pick contiguous characters of string or array
Subsequence means to pick character in the same order but may not be contiguous.
Subset of array/string is nothing but any possible combination of the original array
Permutation of array/string is any combination of same length of the string
*/
package difficult;

/**
 * @author sanjit
 *
 */
public class AllSubSequencesOfString_9 {

		public static void main(String[] args) {
			String s = "AB";
			//printSubSets(s);
			//printSubSets(s,"",0);
			printSubSequences(s, "");

		}
		//without using recursion
		/*private static void printSubSets(String s) {
	        System.out.println("");
			for (int i = 0; i < s.length(); i++) {
				for(int j=i+1;j<=s.length();j++){
					System.out.println(s.substring(i, j));
				}
			}

		}*/

		private static void printSubSets(String s, String current, int count) {
			
			if(s.length()==count){
				System.out.println(current);
				return;
			}
			//not include character
			printSubSets(s,current,count+1);
			//include character
			printSubSets(s, current+s.charAt(count), count+1);
			
		}
		
		 private static void printSubSequences(String s, String result) {
				if(s.length()==0){
					System.out.println(result);
					return;
				}
				//include character
				printSubSequences(s.substring(1), result+s.charAt(0));
				//not include character
				printSubSequences(s.substring(1), result);
				
				
				
				
			}
}
