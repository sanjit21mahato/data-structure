/**
 * 
 */
package medium;

import java.util.Scanner;

/**
 * @author sanjit
 *
 */
public class FactorialTailRecursive_2 {


	public static void main(String[] args) {

     int n;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number");
     n=sc.nextInt();
     
     int fact = calFactorial(n,1);
     System.out.println(fact);

	}

	private static int calFactorial(int n, int fact) {
		if(n==1){
			return fact;
		}
		return calFactorial(n-1, fact*n);
	}

}
