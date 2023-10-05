/*
Given text and pattern as two strings, need check if pattern is present in text or any permutations
of pattern(anagram of pattern) is present in text
Ex: text = "geeksforgeeks"
   pattern = "frog"
Here frog is directly not present but its permutation forg is present in text
So O/P : true;
I/P: "geeksforgeeks"
pattern: "rseek"
O/P: No
*/
package difficult;

/**
 * @author sanjit
 *
 */
public class AnagramSearch_14 {

	public static void main(String[] args) {
		String text = "geeksforgeeks";
		String pattern = "frod";
		boolean isAnagramSearchPresent = checkAnagramEfficient(text,pattern);
		//boolean isAnagramSearchPresent = chekcAnagramSearchNaive(text,pattern);
        System.out.println(isAnagramSearchPresent);
	}

	private static boolean checkAnagramEfficient(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		int countT[] = new int[256];
		int countP[]=  new int[256];
		for(int i=0;i<m;i++){
			countT[text.charAt(i)]++;
			countP[pattern.charAt(i)]++;
		}
		for(int i=pattern.length();i<text.length();i++){
			if(areTPSame(countT,countP)){
				return true;
			}
			countT[text.charAt(i)]++;
			countT[text.charAt(i-m)]--;
		}
		return false;
	}

	private static boolean areTPSame(int[] countT, int[] countP) {
		for(int i=0;i<countT.length;i++){
			if(countT[i]!=countP[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean chekcAnagramSearchNaive(String text, String pattern) {
		int n= text.length();
		int m = pattern.length();
		boolean isAnagram =false;
		for(int i= 0;i<n-m;i++){
			String text1 = text.substring(i, i+m);
			isAnagram=chekAnagram(text1,pattern);
			if(isAnagram){
				return isAnagram;
			}
		}
		
		return isAnagram;
	}

	private static boolean chekAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
       	 return false;
        }
        int freq[] = new int [256];
        for(int i=0;i<s1.length();i++){
       	 freq[s1.charAt(i)]++;
       	 freq[s2.charAt(i)]--;
        }
        for(int i=0;i<freq.length;i++){
       	 if(freq[i]!=0){
       		 return false;
       	 }
        }

		return true;
	
		
	}

}
