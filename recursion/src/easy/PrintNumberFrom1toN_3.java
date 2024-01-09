/**
 * 
 */
package easy;

import java.util.Scanner;

/**
 * @author sanjit
 *
 */
public class PrintNumberFrom1toN_3 {
	
	public static void main(String[] args) {
	 int n=5;
	 int i=1;
	 print(n,i);
    // printNumbers(n,i);
    // printNumbers(n);
	}
	
	private static void print(int n, int i) {
		if(i>n)return;
		System.out.println(i);
		print(n,i+1);
	}

	private static void printNumbers(int n) {
		if(n==0)
			return;
		printNumbers(n-1);
		System.out.println(n);
		
		
	}

	public static void printNumbers(int n, int i){
		System.out.println(i);
		if(i==n)
			return;
		/*It will not work as i++ first executes the statement and then increment the value of i
		 where as ++i first increment and then executes the statement.*/
		//printNumbers(n,i++);
		printNumbers(n,++i);
	}


}
