package difficult;

import java.util.HashMap;

/*
 * Find the longest subarray with equal 0 and 1
 * Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
   Output: 1 to 6 

Input: arr[] = {0, 0, 1, 1, 0}
Output: 
Subarray length : 4

0 to 3 Or 1 to 4

{1, 0, 1, 0, 1, 0, 0}
 * */
public class LongestSubArrayWithEqualZeroAndOne_33 {

	public static void main(String[] args) {
		int arr[]={0, 0, 1, 1, 0};
		int n = arr.length;
		int maxlength =maxLen(arr, n);
		System.out.println(maxlength);

	}

	private static int maxLen(int[] arr, int n) {
        
        int sum = 0;
        int max_len = 0;
        int ending_index = -1;
        int start_index = 0;
 
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
        HashMap<Integer, Integer> hM
        = new HashMap<Integer, Integer>();
 
        for (int i = 0; i < n; i++) {
              sum += arr[i];
            // To handle sum=0 at last index
            if (sum == 0) {
                max_len = i + 1;
                ending_index = i;
            }
            // If this sum is seen before,
            // then update max_len if required
            if (hM.containsKey(sum)) {
                if (max_len < i - hM.get(sum)) {
                    max_len = i - hM.get(sum);
                    ending_index = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum, i);
        }
 
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }
 
        int start = ending_index - max_len + 1;
        System.out.println(start + " to " + ending_index);
 
        return max_len;
	}

}
