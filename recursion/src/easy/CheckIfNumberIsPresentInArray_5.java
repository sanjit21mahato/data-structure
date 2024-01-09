/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class CheckIfNumberIsPresentInArray_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]= {3,5,7,9,8,6};
		boolean isNumberPresent = checkIfNumberIsPresentInArray(arr,6,0);
		System.out.println(isNumberPresent);

	}

	private static boolean checkIfNumberIsPresentInArray(int[] arr, int x, int index) {
		if(index>arr.length-1){
			return false;
		}
		if(x==arr[index]){
			return true;
		}
		return checkIfNumberIsPresentInArray(arr,x,index+1);
		
	}

}
