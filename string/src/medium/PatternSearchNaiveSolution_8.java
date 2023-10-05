/*Overview of Pattern Searching

Naive : O((n-m)*m)
Naive when all characters in pattern are distinct : O(n)

PreProcess Pattern
Rabin Karp : O((n-m)*m) , but better in average cases
KMP : O(n)

Preprocess text
O(m)
*/

/*
I/P: text = "ABABABCD"
pattern = "ABAB"
O/P: 0 and 2

Naive Solution taking O(N2)
*/
package medium;

/**
 * @author sanji
 *
 */
public class PatternSearchNaiveSolution_8 {

	public static void main(String[] args) {
		String text = "ABABABCD";
		String pattern = "ABAB";

		printIndexOfPatternSearch(text, pattern);

	}

	private static void printIndexOfPatternSearch(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();

		for (int i = 0; i <= n - m; i++) {
            int j ;
			for (j = 0; j < m; j++) {
				if (pattern.charAt(j)!= text.charAt(i+j)) {
					break;
				} 
			}
			if(j==m)
				System.out.println(i);
			}
		}
}
