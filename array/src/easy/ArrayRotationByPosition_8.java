package easy;

import java.util.Arrays;

/**
 * @author sanjit
 */

/*
Rotate array by K position anticlock wise 
Ex: arr[] ={1,2,3,4,5,6,7};
     K=2
  O/P = first Rotation:  {2,3,4,5,6,7,1}
        second Rotation: {3,4,5,6,7,1,2}
 */

/*
Efficient: Using reverse technique.
	 * */
public class ArrayRotationByPosition_8 {

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,6,7};
		int k = 2;
		rotateArrayByKposition(arr,k);
		System.out.println(Arrays.toString(arr));

	}

	private static void rotateArrayByKposition(int[] arr, int k) {
     
       reverseArray(arr,0,k-1);
       reverseArray(arr,k,arr.length-1);
       reverseArray(arr,0,arr.length-1);
		
	}

	private static void reverseArray(int[] arr, int left, int right) {
		
		while(left<right){
			int temp = arr[left];
			arr[left]= arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}

	
}
