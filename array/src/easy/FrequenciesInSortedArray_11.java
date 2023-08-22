package easy;

/**
 * @author sanjit
 *
 */
/*
I/P: {10,10,10,25,30,30};
O/P : 10:3
      25:1
      30:2
Two approaches :
       1: using LinkedHashMap 
       2: O(n) without auxillary space,looks simple but implementation wise is tricky
*/      
public class FrequenciesInSortedArray_11 {


	public static void main(String[] args) {
		int arr[] = {10,10,10,25,30,30};
        printFrequencies(arr);
	}

	private static void printFrequencies(int[] arr) {
      int count =1;
      if (arr.length == 1) {
			System.out.println(arr[0] + ":" + count);
			return;
	  }
      for(int i=1;i<arr.length;i++){
    	  if(arr[i]!=arr[i-1]){
    		  System.out.println(arr[i-1]+":"+count);
    		  count=1;
    	  }else{
    		  count++;
    	  }
      }
	  System.out.println(arr[arr.length-1]+":"+count);
	}

}
