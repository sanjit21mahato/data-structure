/*
I/P :{5,10,20,6,3,8};
O/P: 3

I/P : {7,10,13,14}
O/P: 4

*/

package easy;

/**
 * @author sanjit
 *
 */
public class LongestEvenOddSubArray_16 {

	
	public static void main(String[] args) {
		int arr[] ={5,10,20,6,3,8};
		//int arr[] = {7,10,13,14};
        int longestEvenOddSubArray= findLongestEvenoddSubArray(arr);
        System.out.println(longestEvenOddSubArray);
		
	}

	private static int findLongestEvenoddSubArray(int[] arr) {
        int res=1;
        int currentCount=1;
        for(int i=1;i<arr.length;i++){
        	if((arr[i]%2==0 && arr[i-1]%2!=0) || 
        		 (arr[i]%2!=0 && arr[i-1]%2==0)){
        		currentCount++;
        		res= Math.max(currentCount, res);
        	} else {
        		currentCount=1;
        	}
        }
		return res;
	}

}
