/*
 * Find the index or character of left most repeating 
I/P: s1= "geeksforgeeks";
O/P : index of g -- 0

Again two solutions:
1. Using LinkedHashMap since it maintains insertion order
2. Using ASCII values
*/
package easy;

/**
 * @author sanjit
 *
 */
public class LeftMostRepeatingCharacter_3 {

	public static void main(String[] args) {
		String s1= "gbcdedeksforeeks";
        printLeftMostRepeatingCharacter(s1);
		
	}

	private static void printLeftMostRepeatingCharacter(String s1) {
		
		int freq[] = new int[26];
		for(int i=0;i<s1.length();i++){
			freq[s1.charAt(i)-'a']++;
		}
		
		for(int i=0; i<freq.length;i++){
			if(freq[i]>1){
				System.out.println((char)(i+'a'));
				break;
			}
		}
		
		/*int freq[] = new int[255];
		for(int i=0;i<s1.length();i++){
			freq[s1.charAt(i)]++;
		}
		for(int i=0; i<s1.length();i++){
			if(freq[s1.charAt(i)]>1){
				System.out.println(s1.charAt(i));
				break;
			}
		}*/
	}

}
