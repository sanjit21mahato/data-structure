/*
Given n ranges, find the maximum appearing element in these ranges, 
 ranges will be in between 0 to 100
I/P : L[] = {1,2,5,15}
      R[] = {5,8,7,18}
  Ranges : 1-5
           2-8
           5-7
           15-18
O/P :5 

 Efficient Solution:
 traverse through all ranges and increment the value in range in freq array created of size 100
 Return the index of the maximum value
 
*/ 
package easy;

/**
 * @author sanjit
 *
 */
public class MaximumAppearingElementInRanges_23 {

	
	public static void main(String[] args) {
	 int L[] = {1,2,5,15};
	 int R[] = {5,8,7,18};
	 
	 int maxAppearingElement = findMaxAppearinglement(L,R);
	 System.out.println(maxAppearingElement);
	}

	private static int findMaxAppearinglement(int[] L, int[] R) {
		int freq[] = new int[100];
		for (int i = 0; i < L.length; i++) {
			for (int j = L[i]; j <= R[i]; j++) {
				freq[j]++;
			}
		}
		int maxIndex = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > freq[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
