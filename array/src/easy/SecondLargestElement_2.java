/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class SecondLargestElement_2 {

	
	public static void main(String[] args) {

       int arr[] = {10,3,7,8,6,9,12};
       int secondLargestElement = findSecondLargestElement(arr);
       System.out.println("SecondLargest Element in Array:"+ secondLargestElement);

	}

	private static int findSecondLargestElement(int[] arr) {

        int largest= Math.max(arr[0], arr[1]);
        int secondLargest=Math.min(arr[0], arr[1]);
        for(int i =2; i<arr.length; i++){
        	if(arr[i]>largest){
        		secondLargest = largest;
        		largest = arr[i];
        	}
        	if(arr[i]<largest && arr[i]>secondLargest) {
        		secondLargest = arr[i];
        	}
        }
		return secondLargest;
	}

}
