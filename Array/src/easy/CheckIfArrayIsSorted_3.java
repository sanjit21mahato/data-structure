/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class CheckIfArrayIsSorted_3 {

	
	public static void main(String[] args) {

     int arr[] ={3,6,5,9,12,15};
     boolean isSorted= checkIfArrayIsSorted(arr);
     System.out.println(isSorted);
	}

	private static boolean checkIfArrayIsSorted(int[] arr) {
		
		for(int i=1; i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				return false;
			}
		}
		return true;
	}

}
