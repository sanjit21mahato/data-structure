/*
Given a binary array we need to find minimum consecutive flips to make all elements of array same
Flip can be either by fliping 0 or 1

i/p : arr[] ={1,1,0,0,0,1};
O/P: from index 2 to 4

i/p: arr[] ={1,0,0,0,1,0,0,1,1,1,1};
o/P: from 1 to 3
     from 5 to 6

Efficient Solution: the second group elements will always be 
either smaller or equal to 1st group appearance
So, flip second group elements
     
*/
package medium;

/**
 * @author sanjit
 *
 */
public class MinimumConsecutiveFlipsToMakeBinaryArraySame_19 {

	public static void main(String[] args) {
		//int arr[] = { 1, 1, 0, 0, 0, 1 };
		int arr[] ={1,0,0,0,1,0,0,1,1,1,1};
		printMinimumConsecutiveFlips(arr);

	}

	private static void printMinimumConsecutiveFlips(int[] arr) {
        int n =arr.length;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0]) {
					System.out.println("From index:" + i);
				} else {
                    System.out.println("To Index:"+ (i-1));
				}
			}

		}
		if(arr[n-1]!=arr[0]){
           System.out.println("To index:"+ (n-1));
		}
	}

}
