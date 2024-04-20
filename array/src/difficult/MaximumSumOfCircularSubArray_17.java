/*
arr[] = {8,-4,3,-5,4};
o/p: 12

two solutions:
First : O(n2)
Second : O(n)

Max of maximum sum of Normal SubArray and maximum sum of only Circular SubArray

To find the maxsum of only circular subArray 
 ArraySum - minimum sum sub array


*/
package difficult;

/**
 * @author sanjit
 *
 */
public class MaximumSumOfCircularSubArray_17 {

	public static void main(String[] args) {

		int arr[] = { 8, -4, 3, -5, 4 };
		//int arr[] = {2,3,-4};
		//int arr[] = {-3,4,6,-2};
		// int arr[] = {5,-2,3,4};
		int res = calculateMaxSumOfCircularSubArray(arr);
		System.out.println(res);

	}

	private static int calculateMaxSumOfCircularSubArray(int[] arr) {
		int res = arr[0];
		
		int maxSumNormalSubArray = calculateNormalMaxSum(arr);
		int maxSumOnlyCircularSubArray = calculateOnlyCircularMaxSum(arr);
		
		res = Math.max(maxSumNormalSubArray, maxSumOnlyCircularSubArray);
		return res;
	}

	// kadane algorithm (Normal sub Array maximum sum)
	private static int calculateNormalMaxSum(int[] arr) {

		int n = arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(arr[i], maxEnding + arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
	}

	private static int calculateOnlyCircularMaxSum(int[] arr) {

		int n = arr.length;
		int minSum = arr[0];
		int minEnding = arr[0];

		for (int i = 1; i < n; i++) {
			minEnding = Math.min(arr[i], minEnding + arr[i]);
			minSum = Math.min(minEnding, minSum);
		}
		int arrSum = arr[0];
		for (int i = 1; i < n; i++) {
			arrSum = arrSum + arr[i];
		}
		return  arrSum - minSum;
	}
}
