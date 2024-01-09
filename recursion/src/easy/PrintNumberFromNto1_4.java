/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class PrintNumberFromNto1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=5;
		printNumbers(n);

	}

	private static void printNumbers(int n) {
		System.out.println(n);
		if(n==1){
			return;
		}
		printNumbers(n-1);
		
	}

}
