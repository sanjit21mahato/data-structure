/**
 * 
 */
package external.easy;

/**
 * @author sanjit
 *
 */
public class FibonacciForNthTerm {

	public static void main(String[] args) {
		int n =5;
		
		int res = fibonacci(n);
		System.out.println(res);

	}

	private static int fibonacci(int n) {
		
		if(n==0)return 0;
		if(n==1)return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
