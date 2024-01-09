/**
Given an integer array nums and an integer k, return true if there are two distinct indices
i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
package conceptCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sanjit
 *
 */
public class ContainsDuplicateII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = {1,0,1,1};
		int k =1;
		boolean containsDuplicate = containsNearbyDuplicate(nums,k);
		System.out.println(containsDuplicate);

	}
   //Solution1 Naive
	/*private static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, List<Integer>> map = new LinkedHashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				List<Integer> list = map.get(nums[i]);
				list.add(i);
				map.put(nums[i], list);
			}else{
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(nums[i], list);
			}
		}
		
		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
			List<Integer> list = entry.getValue();
			if(list.size()>1){
				for(int i=0;i<list.size()-1;i++){
					int abs = Math.abs(list.get(i)-list.get(i+1));
					if(abs<=k){
						return true;
					}
				}
			}
		}
		
		return false;
	}*/
   
	//Efficeint Solution
	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int previousIndex = map.get(nums[i]);
				if (Math.abs(i - previousIndex) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);

		}
		return false;
	}

}
