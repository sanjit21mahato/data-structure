/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class SumOfDigitsOfNumber_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        int n= 1234;
        int sum = calSumOfDigits(n, 0);
        System.out.println(sum);

	}

	private static int calSumOfDigits(int n, int sum) {
        if(n<1){
        	return sum;
        }
		sum = sum+n%10;
		n = n/10;
		return calSumOfDigits(n,sum);
	}

/*	private static int findSumOfDigits(int n) {
        if(n<10)
        	return n;
		 return n%10+ findSumOfDigits(n/10);
	}*/
}
