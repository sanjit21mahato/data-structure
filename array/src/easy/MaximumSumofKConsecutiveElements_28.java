/*
   int arr[] = {1,2,3,4,5,6};
   int k=3;
   O/P : 15	
   
   Solution:  Window Sling Technique
  Complexity: O(n)
   
*/   
package easy;

/**
 * @author sanjit
 *
 */
public class MaximumSumofKConsecutiveElements_28 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int k =3;
		int maxSum = calculateMaxSumOfKConsecutiveElements(arr,k);
		System.out.println(maxSum);

	}

	private static int calculateMaxSumOfKConsecutiveElements(int[] arr, int k) {
		int currentSum= 0;
		int maxSum=0;
		for(int i=0;i<k;i++){
			currentSum = currentSum+arr[i];
		}
		maxSum= currentSum;
		int i=k;
		while(i<arr.length){
			currentSum = currentSum+arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, currentSum);
			i++;
		}
		
		return maxSum;
	}

}
