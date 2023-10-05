package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int arr1[] = {3,5,7,8};
		int arr2[]	= {3,3,4,5,5};
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
		System.out.println(list);
	}

	

}
