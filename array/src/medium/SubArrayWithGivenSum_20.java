/**
need to check if there exist sub array with a given sum
 * i/p: {1,4,20,3,10,5}
sum :33
O/P : True

Efficient: O(n)/O(1)

 */
package medium;

/**
 * @author sanji
 *
 */
public class SubArrayWithGivenSum_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]= {3,4,20,3,10,5};
		int givenSum = 33;
		boolean isSubArrayWithGivenSum = checkSubArrayWithGivenSum(arr,givenSum);
		System.out.println(isSubArrayWithGivenSum);

	}

	private static boolean checkSubArrayWithGivenSum(int[] arr, int givenSum) {
		int currentSum =0;
		int indexOfRemoval = 0;
		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
			//if(currentSum>givenSum){
			 while (currentSum > givenSum) {
				currentSum = currentSum - arr[indexOfRemoval];
				indexOfRemoval++;
			 }
			//}
			if (currentSum == givenSum) {
				System.out.println("Sub Array is ");
				for(int j = indexOfRemoval; j<=i;j++) {
					System.out.print(arr[j]+ ",");
				}
				return true;
			}
		}
		
		return false;
	}

}
