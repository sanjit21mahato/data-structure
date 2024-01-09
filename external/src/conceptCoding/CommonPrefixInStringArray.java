/**
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
package conceptCoding;

import java.util.Arrays;

/**
 * @author sanjit
 *
 */
public class CommonPrefixInStringArray {

	
	public static void main(String[] args) {
		String s[]= {"dog","racecar","car"};
		//String res = longestCommonPrefix(s);
		String res = longestCommonPrefixEfficient(s);
		System.out.println(res);

	}
//Naive Solution O(n*m)	
public static String longestCommonPrefix(String[] strs) {
        String res="";
        String firstString = strs[0];
        int lengthOfFirstString = strs[0].length();
        for(int i=0;i<lengthOfFirstString;i++){
        	for(int j=1;j<strs.length;j++) {
        		if(strs[j].length()<=i || (firstString.charAt(i)!=strs[j].charAt(i))){
        			return res;
        		}
        	}
        	res =res+firstString.charAt(i);
        }
        return res;
    }
//Efficient Solution O(nlogn)
public static String longestCommonPrefixEfficient(String[] strs) {
	Arrays.sort(strs);
    StringBuffer res =new StringBuffer();
    String firstString = strs[0];
    String lastString = strs[strs.length-1];
    int i=0;
    while(i<firstString.length() && i<lastString.length()){
    	if(firstString.charAt(i)!=lastString.charAt(i)){
    		return res.toString();
    	}else{
    		res.append(firstString.charAt(i));
    		i++;
    	}
    }
    return res.toString();
 }
}


