/**
 * 
 */
package medium;

import java.util.Arrays;

/**
 * @author sanjit
 * 
 */
/*int arr[] = {10,20,20,30,30,30,30};
int inputSize = 7

O/P: arr[] = {10,20,30, , , , };
outputSizr =3

naive Solution: Create temp array of same size and insert only distinct element there
O(n)/O(n)
Efficient:
O(n) time
O(1) space
*/
public class RemoveDuplicatesFromSortedArray_5 {

	
	public static void main(String[] args) {

     //int arr[] = {1,1,1,2,2,3,4,5,5,6};
     int arr[] = {10,20,20,30,30,30,30};
     int outputSize =removeDuplicatesFromSortedArray(arr);
     System.out.println("OutputSize of the resultant Array:"+outputSize);
     System.out.println(Arrays.toString(arr));

     //  removeDuplicatesUsingTwoPointer(arr);
	}

	private static int removeDuplicatesFromSortedArray(int[] arr) {
		
		int outputSize=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[outputSize-1]){
				arr[outputSize] = arr[i];
				outputSize++;
			}
		}
	
		//
		/*int arr1[]=Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr1));*/
		
		return outputSize;
	}
	
	private static int removeDuplicatesUsingTwoPointer(int[] arr) {
		int slow = 0;
		int fast = 1;
		for(int i=1;i<arr.length;i++){
			if(arr[fast]!=arr[slow]){
				slow=slow+1;
				arr[slow]=arr[fast];
			}
			fast=fast+1;
		}
		return slow+1;
	}
}
