/*
Description - Equilibrium index of an array is an index such that the sum of elements at 
lower indexes is equal to the sum of elements at higher indexes.
Input
[-7, 1, 5, 2, -4, 3, 0]
Output
3

Solution1: use native method
O(n)/O(n)
Solution2:
O(n)/O(1) 

*/
package medium;

import java.util.Arrays;

/**
 * @author sanjit
 *
 */
public class EqulibriumIndexofAnArray_22 {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0};
		// int arr[] = {4,2,-2};
		// int arr[] = {4,1,8};
		boolean isEquilibriumPoint = checkEquilibriumIndex(arr);
		System.out.println(isEquilibriumPoint);
		
		// int eqIndex = findEqulibriumIndexofAnArray(arr);
		// System.out.println(eqIndex);
	}

	// O(n)/O(1)
	private static boolean checkEquilibriumIndex(int[] arr) {

		int n = arr.length;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += arr[i];
		}
		/*int leftSum = arr[0];
		int rightSum =0;*/
		int leftSum = 0;
		for (int i = 0; i < n; i++) {
			if (leftSum == totalSum - arr[i]) {
				System.out.println(i);
				return true;
			} else {
				leftSum += arr[i];
				totalSum -= arr[i];
			}
		}
		return false;
	}

	// O(n)/O(n)
	private static int findEqulibriumIndexofAnArray(int[] arr) {
		int eqIndex = -1;
		int leftArr[] = new int[arr.length];
		int rightArr[] = new int[arr.length];
		int sum = 0;
		leftArr[0] = sum;
		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i - 1];
			leftArr[i] = sum;
		}
		System.out.println(Arrays.toString(leftArr));
		int sumRight = 0;
		rightArr[arr.length - 1] = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			sumRight = sumRight + arr[i + 1];
			rightArr[i] = sumRight;
		}
		System.out.println(Arrays.toString(rightArr));
		for (int i = 1; i < arr.length - 1; i++) {
			if (leftArr[i] == rightArr[i]) {
				eqIndex = i;
			}
		}
		return eqIndex;
	}

}
