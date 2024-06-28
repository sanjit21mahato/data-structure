/**
 * 
 */
package easy;

import java.util.Scanner;

/**
 * @author sanjit
 *
 */
public class FactorialNonTailRecursive_1 {


	public static void main(String[] args) {
        int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		n =sc.nextInt();
		
		int fact = calFactorial(n);
		System.out.println(fact);
		
	}

	private static int calFact(int i, int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int calFactorial(int n) {
		if(n==1){
			return 1;
		}
		return n*calFactorial(n-1);
		
	}

}
