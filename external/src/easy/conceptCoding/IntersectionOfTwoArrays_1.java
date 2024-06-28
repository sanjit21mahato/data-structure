package easy.conceptCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Given two integer arrays nums1 and nums2, return an array of their intersection. 
 Each element in the result must appear as many times as it shows in both arrays 
 and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

Also, optimization if the elements are sorted
1,1,2,2,3
3,4,5
 */

public class IntersectionOfTwoArrays_1 {

	public static void main(String[] args) {
		  int arr1[]= {4,9,5};
          int arr2[]= {9,4,9,8,4};
          
		//int arr1[] = {5,7,8};
		//int arr2[]	= {3,3,4,5,5};
		/*int arr[] = intersectionOfArrays(arr1,arr2);
		System.out.println(Arrays.toString(arr));*/
          
         findInterSectionOfArrays(arr1, arr2);  
		
		//can have another soultion if the arrays are sorted
		//List<Integer>list= intersectionOFSortedArrays(arr1,arr2);
		//System.out.println(list);
		

	}


	private static void findInterSectionOfArrays(int[] arr1, int[] arr2) {
		 List<Integer> list1 = new ArrayList<>();
         for(int i=0;i<arr1.length;i++){
        	 list1.add(arr1[i]);
         }
        List<Integer> list = new ArrayList<>();
         for(int i=0;i<arr2.length;i++){
        	 if(list1.contains(arr2[i])){
        		 list.add(new Integer(arr2[i]));
        		 int x= arr2[i];
        		 list1.remove(new Integer(x));
        	 }
         }

         if(list.size()>0){
        	int arr[] = list.stream().mapToInt(e->e).toArray();
        	System.out.println(Arrays.toString(arr));
         }
		
	}


	private static int[] intersectionOfArrays(int[] arr1, int[] arr2) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}
		}

		if (list.size() > 0) {
			int[] arr = list.stream().mapToInt(i -> i).toArray();
			return arr;
		} else {
			System.out.println("No elements found in intersection of arrays");
			return new int[0];
		}

	}
	
	private static List<Integer> intersectionOFSortedArrays(int[] arr1, int[] arr2) {
		List<Integer>list = new ArrayList<>();
		for(int i=0,j=0; i<arr1.length && j<arr2.length; ){
			if(arr1[i]<arr2[j]){
				i++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		return list;
	}

}
