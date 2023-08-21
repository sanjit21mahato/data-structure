/*
 * I/P: {0,1,1,0,1,0}
O/P: 2
I/P: {1,1,1,1}
O/P: 4
*/

package easy;

/**
 * @author sanjit
 *
 */
public class MaximumConsecutiveOnesInArray_14 {

	
	public static void main(String[] args) {
		int arr[]={0,1,1,0,1,0};
		int maximumConsecutiveOnes = findMaximumConsecutiveOnes(arr);
		System.out.println(maximumConsecutiveOnes);

	}

	private static int findMaximumConsecutiveOnes(int[] arr) {
		int currentCount =0;
		int maxCount= 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			}
			else if (arr[i] == 0) {
				currentCount = 0;
			}
				
		}
		
		return maxCount;
	}

}
