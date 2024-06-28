/*
Lexicographic rank of a string
Ex: s1 ="BAC"

Sort the string which becomes "ABC" and find all permuatation in increasing order
       Rank
 ABC    1
 ACB    2
 BAC    3
 BCA    4
 CAB    5
 CBA    6
 
 Now check the rank of input string which is 3
 O/P: 3
 
 Ex: "CBA"
  O/P: 6
  
Naive Solution: Find all permutation and add in TreeSet and compare the string and mainatain count. 
In Worst case we need to n* Fact(n)
Efficient Solution: in O(n)  
  */
package difficult;

import java.util.Arrays;

/**
 * @author sanji
 *
 */
public class LexicographicRankofString_15 {



	public static void main(String[] args) {
		
		String s1= "CAB";
		int rank = findLexicographicRank(s1);
		System.out.println(rank);

	}

	private static int findLexicographicRank(String s1) {
		int n= s1.length();
		int rank =1;
		int fact = findFactorial(n);
		int arr[]= new int[256];
		for(int i=0;i<n;i++){
		 arr[s1.charAt(i)]++;	
		}
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++){
			arr[i]+=arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n-1;i++){
			 fact = fact/(n-i);
			rank= rank+arr[s1.charAt(i)-1]*fact;
			for(int j= s1.charAt(i);j<arr.length;j++){
				arr[j]--;
			}
		System.out.println(Arrays.toString(arr));
		}
		return rank;
	}
	
	

	private static int findFactorial(int n) {

        if(n==1){
        	return 1;
        }
		return n*findFactorial(n-1);
	}
}
