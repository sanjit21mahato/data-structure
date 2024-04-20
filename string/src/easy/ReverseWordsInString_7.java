/*
I/P : "You love coding";
O/P:  "coding love You";

You love coding
uoY evol gnidoc
coding love You

Two solutions
1>With Auxillary Space 
2>With Constant Auxillary space O(1)

here assumption is there is single space between words

*/
package easy;

/**
 * @author sanjit
 *
 */
public class ReverseWordsInString_7 {

	public static void main(String[] args) {
		String s1 = "You love coding";
		reverseWordsInString(s1.toCharArray());
		
		//String res = reverseWordsInStringWithAuxillarySpace(s1);
		//System.out.println(res);
		//System.out.println(s1);

	}
    
	private static void reverseWordsInString(char str []) {
        int n= str.length;
		int left=0;
		for(int i=0; i<=n-1;i++) {
			if(str[i] == ' '){
				reverse(str, left, i-1);
				left = i+1;
			}
		}
		//explicitly reversing the last word since for last word we may not find space
		reverse(str,left,n-1);
		//reverse the whole string
		reverse(str,0,n-1);
		System.out.println(str);
		
	}
	private static void reverse(char str[], int left, int right) {
		while(left<right) {
			char temp = str[left];
			str[left]=str[right];
			str[right]=temp;
			left++;
			right--;
		}
	}
	
	//This solutions takes auxillay space 
	private static String reverseWordsInStringWithAuxillarySpace(String s1) {
			String arr[]= s1.split(" ");
			int n = arr.length;
			String res ="";
			for(int i=n-1;i>=0;i--){
				res=res+arr[i] + " ";
			}
			return res;
		}


}
