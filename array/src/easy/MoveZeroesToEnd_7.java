package easy;

import java.util.Arrays;

/**
 * @author sanji

 */

/*arr[] ={8,5,0,10,0,20}
o/p :    {8,5,10,20,0,0}

One traversal 
O(n)
O(1)
*/

public class MoveZeroesToEnd_7 {

	public static void main(String[] args) {
		int arr[] ={8,5,0,10,0,20};
		moveZeroesToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void moveZeroesToEnd(int[] arr) {
		
		int countOfNonZero = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				int temp = arr[i];
				arr[i]= arr[countOfNonZero];
				arr[countOfNonZero]=temp;
				countOfNonZero++;
			}
		}
		
	}

}
