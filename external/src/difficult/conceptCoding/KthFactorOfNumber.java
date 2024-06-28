/**
You are given two positive integers n and k. A factor of an integer n is defined as an integer i
where n % i == 0.

Consider a list of all factors of n sorted in ascending order, return the kth factor in this 
list or return -1 if n has less than k factors.
Example 1:
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
Example 2:
Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
Example 3:
Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
 */
package conceptCoding;

import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author sanjit
 *
 */
public class KthFactorOfNumber {

	public static void main(String[] args) {
		int n = 12;
		int k = 3;
		int kthFactor= kthFactor(n,k);
		System.out.println(kthFactor);	
	}

	private static int kthFactor(int n, int k) {
		for(int i=1;i<=n;i++){
			if(n%i==0){
			 k--; 	
			}
			if(k==0){
				return i;
			}
		}
		return -1;
	}
	
	/*private static int kthFactor(int n, int k) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int index =1;
		for(int i=1;i<=n/2;i++){
			if(index>k){
				break;
			}
			if(n%i ==0){
				map.put(index, i);
				index++;
			}
		}
		map.put(index, n);
		if(k>index){
			return -1;
		}else{
			return map.get(k);
		}
		
	}*/

	/*private static int kthFactor(int n, int k) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		for (int i = 2; i <= n / 2; i++) {
			if (set.size() >= k) {
				break;
			}
			if (n % i == 0) {
				set.add(i);
			}
		}
		if (set.size() < k) {
			set.add(n);
		}
		if (set.size() < k) {
			return -1;
		} else {
			return set.last();
		}

	}*/

	

}
