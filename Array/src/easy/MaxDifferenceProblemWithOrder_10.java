package easy;
/**
 * @author sanjit
 */

/*
Maximum value = arr[j]-arr[i] such that j>i
I/p: arr[] ={2,3,10,6,4,8,1}
O/P: 8
	
i/p arr[] = {7,9,5,6,3,2,12}
o/p : 10
*/
public class MaxDifferenceProblemWithOrder_10 {

	public static void main(String[] args) {
		int arr[] ={9,7,5,6,3,2,12};
        int maxDifference = findMaxDifference(arr);
        System.out.println("Maximum Difference:"+ maxDifference);
	}

	private static int findMaxDifference(int[] arr) {
		
		int minimum = Math.min(arr[0], arr[1]);
		int res = arr[1]-arr[0];
		
		for(int i=1;i<arr.length;i++){
			int currentDiff = arr[i]-minimum;
			res = Math.max(res, currentDiff);
			minimum = Math.min(arr[i], minimum);
		}
		
		return res;
	}

}
