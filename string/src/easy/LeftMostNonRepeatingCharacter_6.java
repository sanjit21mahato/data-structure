/**
 * 
 */
package easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sanjit
 *
 */
public class LeftMostNonRepeatingCharacter_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			String str = "abcdbc";
			findLeftMostNonRepeatingUsingLinkedHashMap(str);

		}

		private static void findLeftMostNonRepeatingUsingLinkedHashMap(String str) {

			Map<Character, Integer> lHashMap = new LinkedHashMap<>();
			for (int i = 0; i <= str.length() - 1; i++) {
				lHashMap.put(str.charAt(i), lHashMap.getOrDefault(str.charAt(i), 0) + 1);
			}
			
	/*		
			for (Map.Entry<Character,Integer> entryset : lHashMap.entrySet()) {
				if(entryset.getValue()==1){
					System.out.println(entryset.getKey());
					break;
				}
			}
			*/
			
			lHashMap.forEach((k, v) -> {
				if (v == 1) {
					System.out.println(k);
				}
			});
		}

}
