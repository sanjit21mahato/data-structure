/*
 * majority element is the element which appears more than half of the size of the array
 * arr[] = {8,3,4,8,8}
 * Size of array is 5 and 8 appears three times which more than half of the size of array
 * O/P : 8 
 * 
 * arr[] = {3,7,4,7,7,5}
 * Size is 6 
 * 7 appears only three times which is not more than half of the size 
 * O/P : No element
 * 
  Two Solutions 
  1  using HashMap O(n) time and O(n) space complexity
  2. Using Moore's Voting Algorithm which O(n) time and O(1) space complexity
   It works in two phase 
   First phase finds an element that can be majority
   and second phase confirms if the element found in 1st phase is majority
   second phase is required only when there is no majority element.
   If question says that there is a majority element in the array then 2nd phase is not required.
  */
package difficult;

/**
 * @author sanjit
 *
 */
public class MajorityElementInArray_18 {

	public static void main(String[] args) {
		int arr[] = {8,3,4,8,8};
		//int arr[] = {4,4,7,4,4,7};
		//Using Moore's Voting Algorithm
		int majorityElement = findMajorityElement(arr);
		if(majorityElement!=-1){
		 System.out.println("Majority element: "+majorityElement);
		}else {
			System.out.println("There is no majority Element");
		}
		
	}

	private static int findMajorityElement(int[] arr) {
		//1st pahse
        int n= arr.length;
        int majorityElement = 0;
        int count =1;
        for(int i=1; i<n;i++){
        	if(arr[i] ==majorityElement){
        		count++;
        	}else {
        		count--;
        	}
        	if(count ==0){
        		majorityElement = arr[i];
        		count = 1;
        	}
        }
        
        //2nd Phase
        int majorityCount =0;
        for(int i=0;i<n;i++){
        	if(arr[i] == majorityElement){
        		majorityCount = majorityCount+1;
        	}
        }
        if(majorityCount>n/2){
        	return majorityElement;
        }else{
        	return -1;
        }
		
	}
}
