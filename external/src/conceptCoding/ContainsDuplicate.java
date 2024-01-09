/**
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false
 */
package conceptCoding;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sanjit
 *
 */
public class ContainsDuplicate {


	public static void main(String[] args) {
		int nums[]={1,2,3,1};
		boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);
	}

	private static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++){
           if(set.add(nums[i])==false){
        	   return true;
           }
		}
		return false;
	}

}
