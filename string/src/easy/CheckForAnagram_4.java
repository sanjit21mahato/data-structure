/*
Two strings are anagram of each other if every character of a string appears in other string and 
frequency of each character is same in both strings.

I/P  s1: listen;
     s2: silent;
  
O/P: true*/
package easy;

/**
 * @author sanjit
 *
 */
public class CheckForAnagram_4 {

	public static void main(String[] args) {
		
		String s1= "listen";
        String s2= "silent";
        boolean isAnagram = checkForAnagram(s1,s2);
        System.out.println(isAnagram);
	}

	private static boolean checkForAnagram(String s1, String s2) {
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
