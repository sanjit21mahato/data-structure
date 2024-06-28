package difficult;
/*
 * Given a rope of length n, and three-piece lengths a, b and c. We need to
 * find the maximum number of pieces we can make of the rope such that the
 * length of every piece is in {a, b, c}.
 */
/*
 * Input : n = 5, a = 1, b = 2, c = 3 Output : 5 We make 5 pieces each of
 * length 1.
 * 
 * Input : n = 23, a = 11, b = 9, c = 12 Output : 2 We make 2 pieces lengths
 * 11 and 12.
 * 
 * Can be solved using recursion but this problem has better solution using dynamic Programming 
 */

public class RopeCuttingIntoMaxPiecesEachBeingInSubset_8 {

	public static void main(String[] args) {
		
		/*int n=23;
		int a= 11;
		int b= 9;
		int c= 12;*/
		int n=13,a=8,b=7,c=3;
		int max =findMaximumCutPossible(n,a,b,c);
		System.out.println(max);
		
		/*int n = 23;
		int arr[] = {11, 9, 12 };
		int max = 0;
		max = findmaxPossibleWay(n, arr);
		System.out.println(max);
*/
	}
	
	private static int findMaximumCutPossible(int n, int a, int b, int c) {

		if (n < 0){
			return -1;
		}
		if (n == 0) {
			return 0;
		}
/*		int max = Math.max(Math.max(findMaximumCutPossible(n - a, a, b,c), findMaximumCutPossible(n - b, a, b,c)), 
				findMaximumCutPossible(n-c, a, b, c));*/
		int temp1 = findMaximumCutPossible(n-a, a, b, c);
		int temp2 = findMaximumCutPossible(n-b, a, b, c);
		int temp3 = findMaximumCutPossible(n-c, a, b, c);
		int pecies = Math.max((Math.max(temp1, temp2)), temp3);
				
		if (pecies == -1){
			return -1;
		}
		else {
			return pecies + 1;
		}
	}
	
    //Non Recursive Solution
	private static int findmaxPossibleWay(int n, int[] arr) {
		int max = 0;
		int currentMax=0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (n % arr[i] == 0) {
				currentMax = n / arr[i];
				if(currentMax>max){
					max= currentMax;
				}
			} else {
				int temp = n % arr[i];
				boolean ifTempInArray = findTempInArray(temp, arr, 0);
				if (ifTempInArray) {
					int tempmax = (n / arr[i]) + 1;
					if (tempmax > max)
						max = tempmax;
				}

			}
		}
		return max;
	}

	private static boolean findTempInArray(int temp, int[] arr, int j) {

		if (j >= arr.length - 1) {
			return false;
		}
		if (arr[j] == temp) {
			return true;
		}
		return findTempInArray(temp, arr, j + 1);
	}
}
