package medium;

import java.util.Arrays;

public class MergeTwoSortedArraysToHaveThirdSortedArray_31 {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 8, 9 };
		int arr2[] = { 2, 7, 11, 15, 17 };
		mergerSortedArray(arr1, arr2);
	}

	private static void mergerSortedArray(int[] arr1, int[] arr2) {

		int n1 = arr1.length;
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n1 && j < n2) {

			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (j < n2) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		while (i < n1) {
			arr3[k] = arr1[i];
			i++;
			k++;

		}
		System.out.println(Arrays.toString(arr3));
	}

}
