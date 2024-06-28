/*Given an array arr[] of size N, the task is to generate the prefix sum array of the given array.

Prefix Sum Array: The prefix sum array of any array, arr[] is defined as an array of same size say,
prefixSum[] such that the value at any index i in prefixSum[] is 
sum of all elements from indexes 0 to i in arr[].
 
Input  : arr[] = {10, 20, 10, 5, 15}
Output : prefixSum[] = {10, 30, 40, 45, 60}

*/
package easy;

import java.util.Arrays;

/**
 * @author sanjit
 *
 */
public class PrefixSumArray_21 {

	
	public static void main(String[] args) {
		int arr[] = {10, 20, 10, 5, 15};
		calPrefixSumArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void calPrefixSumArray(int[] arr) {
       int prefixSum = arr[0];
       for(int i= 1;i<arr.length;i++){
    	   //prefixSum = arr[i-1]+arr[i];
    	   prefixSum = prefixSum+arr[i];
    	   arr[i]=prefixSum;
       }
	}
}
