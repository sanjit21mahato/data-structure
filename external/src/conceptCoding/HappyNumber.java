/**
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false
 
Constraints:

1 <= n <= 231 - 1

 */

//https://leetcode.com/problems/happy-number/submissions/
	
package conceptCoding;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sanjit
 *
 */
public class HappyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		boolean isHappyNumber = checkIfHappyNumber(n);
		System.out.println(isHappyNumber);
		
	}
    //First Solution
	/*private static boolean checkIfHappyNumber(int n) {
		
		if(n==1){
			return true;
		}else {
			Set<Integer> set = new HashSet<>();
			int sum = calculateSumOfSquareOfDigits(n);
			set.add(sum);
			while(sum!=1){
				sum=calculateSumOfSquareOfDigits(sum);
				if(set.contains(sum)){
					return false;
				}else{
					set.add(sum);
				}
			}
			return true;
		}
	}*/
//Second Solution
	private static boolean checkIfHappyNumber(int n) {

		if (n == 1) {
			return true;
		} else {
			int slow = n;
			int fast = n;
			do {
				slow = calculateSumOfSquareOfDigits(slow);
				fast = calculateSumOfSquareOfDigits(calculateSumOfSquareOfDigits(fast));
			} while (slow != fast);

			return slow == 1;
		}
	}
	
	private static int calculateSumOfSquareOfDigits(int n) {
		int sum =0;
		while(n>0){
			 int digit = n%10;
			 sum = sum+digit*digit;
			 n = n/10;
		}
		return sum;
	}

}
