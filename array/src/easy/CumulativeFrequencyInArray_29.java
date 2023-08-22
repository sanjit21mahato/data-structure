/* 
 * I/P ={1,2,2,1,3,4};
   O/P 1: 2
       2:2+2=4
       3:4+1=5
       4:5+1=6
    */
package easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sanjit
 *
 */
public class CumulativeFrequencyInArray_29 {

	public static void main(String[] args) {
		int arr[] ={1,2,2,1,3,4};
		printCumulativeFrequency(arr);	
	}

	private static void printCumulativeFrequency(int[] arr) {
     Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();		
     for(int i=0;i<arr.length;i++){
    	 map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
     }
     int cumulativeFrequency =0;
     for(Map.Entry<Integer, Integer> entry: map.entrySet() ){
    	 cumulativeFrequency = cumulativeFrequency+ entry.getValue();
    	 System.out.println(entry.getKey() +":"+ cumulativeFrequency);
     }     
     
	}

}
