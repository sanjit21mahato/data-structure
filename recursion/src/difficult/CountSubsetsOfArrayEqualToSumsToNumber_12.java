/**
 * 
 */
package difficult;

/**
 * @author sanjit
 *
 */
public class CountSubsetsOfArrayEqualToSumsToNumber_12 {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 2, 1, 6 ,7};
		int sum = 8;

		int count = countSubsetsOfArrayEqualToSumsToNumber(arr, arr.length, sum);
		System.out.println(count);

	}

	private static int countSubsetsOfArrayEqualToSumsToNumber(int[] arr, int n, int sum) {

		if (n == 0) {
			if (sum == 0)
				return 1;
			else
				return 0;
		}

		return countSubsetsOfArrayEqualToSumsToNumber(arr, n - 1, sum)
				+ countSubsetsOfArrayEqualToSumsToNumber(arr, n - 1, sum - arr[n - 1]);
	}

}
