/*I/P arr: {1,9,6,25,5,10};
 
 x= 14
 O/P: yes 9,5
 
 */
package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sanjit
 *
 */
public class PairWithGivenSum_27 {

	public static void main(String[] args) {
		int arr[]= {1,9,6,25,5,10};
		int x=14;
		findPairWithGivenSum(arr,x);

	}

	private static void findPairWithGivenSum(int[] arr, int x) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(x - arr[i])) {
				System.out.println(x - arr[i] + "," + arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
	}

}
