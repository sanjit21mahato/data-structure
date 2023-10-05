package difficult;

/*
I/P: text = "ABCABCD"
pattern = "ABCD"
O/P: 3
*/

//if pattern is distinct we can use this 

public class PatternSearchImprovedNaiveSolutionForDistinctPattern_9 {

	public static void main(String[] args) {
		String text = "ABCABCD";
		String pattern = "ABCD";

		printIndexOfPatternSearch(text, pattern);

	}
	//if pattern is distinct we can use this
	private static void printIndexOfPatternSearch(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();

		for (int i = 0; i <= n - m;) {
            int j ;
			for (j = 0; j < m; j++) {
				if (pattern.charAt(j) != text.charAt(i+j)) {
					break;
				} 
			}
			if(j==m){
				System.out.println(i);
			}
			if(j==0){
				i++;
			}
			else{
				i = i+j;
			}

		}
	}

}
