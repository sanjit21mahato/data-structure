/*
Given a sorted Array with possibly duplicate element
the task is to find indexes of first and last occurrence of an element 
int arr[] ={1,2,3,3,3,3,4,5,6};
x=3;
first occurence = 2
last occurence = 5	
*/
package medium;

/**
 * @author sanjit
 *
 */
public class FirstAndLastOccurenceInSortedArray_26 {


	public static void main(String[] args) {
		int arr[] ={1,2,3,3,3,3,4,5,6};
		int x=3;
		findFirstAndLastOcuurence(arr,x);
		
		//int firstOccurence = findFirstOccurence(arr, x, 0, arr.length - 1);
		//System.out.println(firstOccurence);

	}

	private static void findFirstAndLastOcuurence(int[] arr, int x) {
		int firstOccurenceIndex=-1;
		int lastOccurenceIndex=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x && firstOccurenceIndex==-1){
				firstOccurenceIndex=i;
			}
			else if(arr[i]==x){
				lastOccurenceIndex=i;
			}
		}
		System.out.println("First Occurence Index:"+firstOccurenceIndex);
		System.out.println("Last Occurence Index:"+lastOccurenceIndex); 
		
	}
	
	private static int findFirstOccurence(int[] arr, int x, int leftIndex, int rightIndex) {
		if (leftIndex > rightIndex) {
			return -1;
		}
		int middleIndex = (leftIndex + rightIndex) / 2;
		if (x == arr[middleIndex]) {
			if (arr[middleIndex - 1] < x || middleIndex == 0 ) {
				return middleIndex;
			} else {
				rightIndex = middleIndex - 1;
			}
		} else {
			if (x > arr[middleIndex])
				leftIndex = middleIndex + 1;
			else
				rightIndex = middleIndex - 1;
		}
		
		return findFirstOccurence(arr, x, leftIndex, rightIndex);
	}

}
