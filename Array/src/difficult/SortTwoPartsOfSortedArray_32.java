package difficult;

import java.util.Arrays;

public class SortTwoPartsOfSortedArray_32 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, 2, 3, 4, 6, 7};
		int l = 0;
		int m = 3;
		int r = arr.length-1;
		merge(arr, l, m, r);
		System.out.println(Arrays.toString(arr));
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
