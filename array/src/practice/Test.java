package practice;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 0, 1, 0, 0 };
		int n =arr.length;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				if(arr[i]!=arr[0]){
					System.out.println("from index:"+i);
				}else{
					System.out.println("To index:"+(i-1));
				}
			}
		}
	   if(arr[n-1]!=arr[0]){
		   System.out.println("To Index:"+ (n-1));
	   }
	}

	

}
