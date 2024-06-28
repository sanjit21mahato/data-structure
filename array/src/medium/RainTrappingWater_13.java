/*
	 * Consider input array as vertical bar and calculate the total rain water
	 * trapped
	 *  int arr[] = {3,0,0,2,0,4}; 
	 *  O/P = 3+3+1+3 
	 *  int arr[] = {3,1,0,4};
	 * O/P = 5 
	 * int arr[] = {3,2,1}; O/P = 0
	 */
package medium;

import java.util.Arrays;

/**
 * @author sanjit
 *
 */
public class RainTrappingWater_13 {

	public static void main(String[] args) {
		 int arr[] = {3,0,0,2,0,4};
		// int arr[] = {3,1,0,4};
		//int arr[] = { 3, 2, 1 };
		//O(n)/O(n)
		int rainWaterTrapped = calculateRainWaterTrapped(arr);
		System.out.println(rainWaterTrapped);
		//O(n)/O(1)
		//int totalWaterTrapped = calculateRainWaterTrappedEfficient(arr);
		//System.out.println(totalWaterTrapped);
	}

	private static int calculateRainWaterTrapped(int[] arr) {
		int totalWaterTrapped = 0;
		int n = arr.length;
		int leftMaxArr[] = new int[n];
		int rightMaxArr[] = new int[n];

		leftMaxArr[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftMaxArr[i] = Math.max(arr[i], leftMaxArr[i - 1]);
		}
		System.out.println(Arrays.toString(leftMaxArr));

		rightMaxArr[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMaxArr[i] = Math.max(arr[i], rightMaxArr[i + 1]);
		}
		System.out.println(Arrays.toString(rightMaxArr));

		for (int i = 1; i < n - 1; i++) {
			totalWaterTrapped = totalWaterTrapped + (Math.min(leftMaxArr[i], rightMaxArr[i]) - arr[i]);
		}

		return totalWaterTrapped;
	}

	public static int calculateRainWaterTrappedEfficient(int[] heights)
    {
        // maintain two pointers left and right, pointing to the leftmost and
        // rightmost index of the input array
        int left = 0, right = heights.length - 1, water = 0;
 
        int maxLeft = heights[left];
        int maxRight = heights[right];
 
        while (left < right)
        {
            if (heights[left] <= heights[right])
            {
                left++;
                maxLeft = Integer.max(maxLeft, heights[left]);
                water += (maxLeft - heights[left]);
            }
            else {
                right--;
                maxRight = Integer.max(maxRight, heights[right]);
                water += (maxRight - heights[right]);
            }
        }
 
        return water;
    }
}
