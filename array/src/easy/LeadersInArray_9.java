package easy;

/**
 * @author sanjit
 */

/*
An element is Leader in the array if there is no greater element in right side of the array. 
I/P: arr[] = {7,10,4,10,6,5,2};
O/P : 2,5,6,10

O(n)
*/
public class LeadersInArray_9 {

	public static void main(String[] args) {
		int arr[] = {7,10,4,10,6,5,2};
		printLeadersInArray(arr);

	}

	private static void printLeadersInArray(int[] arr) {
	   int n = arr.length;
	   int currentLeader=arr[n-1];
       System.out.print(arr[n-1] + " ");
       for(int i=n-2;i>=0;i--){
    	  if(arr[i]>currentLeader){
    		  currentLeader =arr[i];
    		 System.out.print(arr[i] + " ");
    	  }
    	   
       }
		
	}

}
