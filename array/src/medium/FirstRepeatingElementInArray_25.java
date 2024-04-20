/*
the first element in order which got repeated
i/p arr {10,5,3,4,3,5,10}
o/p : 10


//Notes : use LinkedHashMap as it maintains insertion order
*/
package medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sanjit
 *
 */
public class FirstRepeatingElementInArray_25 {

	public static void main(String[] args) {
		int arr[] = {10,5,3,4,3,5,10};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ;
		}
		for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() > 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}

}
