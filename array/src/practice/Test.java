package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 8, 9 };
		int arr2[] = { 2, 7, 11, 15, 17 };
	    int n1 = arr1.length;
	    int n2= arr2.length;
	    int arr[]= new int[n1+n2];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				arr[k]=arr1[i];
				i++;
				k++;
			}else{
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(j<arr2.length){
			arr[k]=arr2[j];
			j++;
			k++;
		}
	    while(i<arr1.length){
	    	arr[k]=arr1[i];
	    	i++;
	    	k++;
	    }
	    
	    System.out.println(Arrays.toString(arr));
	}

	

}
