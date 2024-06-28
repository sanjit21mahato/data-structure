/*
 * Description : We are given an array of positive and negative integers. 
 * We have to find maximum sum of sub array (contiguous elements)

Input
[-3, 4, -1, -2, 1, 5 ]
Output
7 : 4, -1, -2, 1, 5 

Input
[2, 3, -8, 7, -1, 2, 3 ]
Output
11

This is based on principle that in an array the maximum sum of subarray at any index 
will be maximum of the sum of maximum subarray at previous element and element at index and 
the element at that index 
*/
package medium;

/**
 * @author sanjit
 *
 */
public class MaximumSumOfSubArray_15 {

	public static void main(String[] args) {
		 int arr[] = {-3, 4, -1, -2, 1, 5 };
		//int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		int maximumSum = findMximumSumOfSubArray(arr);
		System.out.println("Maximum Sum of Sub Array:" + maximumSum);

	}

	// kadane algorithm
	private static int findMximumSumOfSubArray(int[] arr) {/*
		int n = arr.length;
		int maxSum = arr[0];
		int maxEndingAtIndex = arr[0];
		for (int i = 1; i < n; i++) {
			maxEndingAtIndex = Math.max(maxEndingAtIndex + arr[i], arr[i]);
			maxSum = Math.max(maxSum, maxEndingAtIndex);
		}
		return maxSum;
	*/
		
		int maxEndingAtPreIndex=arr[0];
		int maxSum= arr[0];
		for(int i=1; i<arr.length;i++){
			int maxEndingAtIndex = Math.max(arr[i], arr[i]+maxEndingAtPreIndex);
			maxSum = Math.max(maxSum, maxEndingAtIndex);
			maxEndingAtPreIndex = maxEndingAtIndex; 
			
		}
		return maxSum;
	
	}

	/*private static int findMximumSumOfSubArray(int[] arr) {
		int maxSum = arr[0];
		int maxSumArr[] = new int[arr.length];
		maxSumArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int currentMaxSum = Math.max(arr[i], maxSumArr[i - 1] + arr[i]);
			maxSumArr[i] = currentMaxSum;
			maxSum = Math.max(maxSum, currentMaxSum);
		}
		return maxSum;
	}*/

}
