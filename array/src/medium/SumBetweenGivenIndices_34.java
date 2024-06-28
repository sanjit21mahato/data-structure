package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Description : We are given an Array of n integers, We are given q queries having indices l and r.
We have to find out sum between the given range of indices.
Input 
[4, 5, 3, 2, 5]
3
0 3
2 4
1 3
Output
14 (4+5+3+2)
10 (3+2+5)
10 (5+3+2)

Simple Solution would be to run a loop from l to r and call this function for earch query
which will give O(n) complexity

Can we solve by O(1) complexity during run time  by using some pre-processing some structure before
*/

public class SumBetweenGivenIndices_34 {

	public static void main(String[] args) {

     int arr[] = {4,5,3,2,5};
     
     List<List<Integer>> list = new ArrayList<>();
     
     List<Integer> list1 = new ArrayList<>();
     list1.add(0);
     list1.add(3);
     list.add(list1);
     
     List<Integer> list2 = new ArrayList<>();
     list2.add(2);
     list2.add(4);
     list.add(list2);
     
     List<Integer> list3 = new ArrayList<>();
     list3.add(1);
     list3.add(3);
     list.add(list3);
     
     int prefixSumArr[] = new int [arr.length];
     int currentSum =0;
     for(int i =0; i<arr.length;i++){
    	 currentSum= currentSum+ arr[i];
    	 prefixSumArr[i]= currentSum;
     }
     System.out.println(Arrays.toString(prefixSumArr));
     for(List<Integer> indexList :list){    	  
    	 int sum = calculateSumBetweenGivenIndex(arr,prefixSumArr, indexList);
    	 System.out.println(sum);
    	 
     }

	}

	private static int calculateSumBetweenGivenIndex(int[] arr, int[] prefixSumArr, List<Integer> indexList) {

       int l = indexList.get(0);
       int r = indexList.get(1);
       int res = 0;
       if(l!=0){
       res = prefixSumArr[r]- prefixSumArr[l-1];
       }else {
    	  res = prefixSumArr[r];
       }

		return res;
	}

}
