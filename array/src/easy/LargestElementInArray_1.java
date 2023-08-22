package easy;

/**
 * @author sanjit
 *
 */
public class LargestElementInArray_1 {
	
	public static void main(String[] args) {
		int arr[] = {5,8,12,4,3,9,7};
		int largestElement = findLargestElement(arr);
		System.out.println("Largest Element in Arrya is:"+largestElement);

	}

	private static int findLargestElement(int[] arr) {
		int result =arr[0];
		for(int i=1;i<arr.length;i++){
			result = Math.max(result, arr[i]);
	    }
		return result;
   }
	

}