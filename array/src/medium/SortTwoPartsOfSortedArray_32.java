package medium;

import java.util.Arrays;

public class SortTwoPartsOfSortedArray_32 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, 2, 3, 4, 6, 7};
/*		int l = 0;
		int m = 3;
		int r = arr.length-1;
		merge(arr, l, m, r);
		System.out.println(Arrays.toString(arr));*/
		
		int j=0;
		int arrEnd=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				j=i;
				arrEnd=i-1;
			}
		}
		merge(arr,j, arrEnd);
		
	}

	private static void merge(int[] arr, int j, int arrEnd) {

		int arr2[]= new int [arr.length];
		int k=0;
		int i=0;
		while(i<arrEnd && j<arr.length){
			if(arr[i]<arr[j]){
				arr2[k]= arr[i];
				k++;
				i++;
			}else {
				arr2[k]=arr[j];
				k++;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		while(i<=arrEnd){
			arr2[k]=arr[i];
			k++;
			i++;
		}
		while(j<arr.length){
			arr2[k]=arr[j];
			k++;
			j++;
		}
		System.out.println(Arrays.toString(arr2));
	
		
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2=  r-m;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0; i<n1;i++){
			//it is l+i as l may not be 0 when used for merge sort
			leftArr[i]=arr[l+i];
		}
		System.out.println(Arrays.toString(leftArr));
		for(int i=0; i<n2;i++){
			rightArr[i]=arr[m+i+1];
		}
		System.out.println(Arrays.toString(rightArr));
		int i=0;
		int j=0;
		int k =l;
	    while(i<n1 && j<n2) {
		  if(leftArr[i]<=rightArr[j]){
			  arr[k]= leftArr[i];
			  i++;
			  k++;
		  }else{
			  arr[k]=rightArr[j];
			  j++;
			  k++;
		  }
	   }
	   while(i<n1){
		   arr[k]=leftArr[i];
		   i++;
		   k++;
	   }
	   while(j<n2){
		   arr[k]=rightArr[j];
		   j++;
		   k++;
	   }
		

	}

}
