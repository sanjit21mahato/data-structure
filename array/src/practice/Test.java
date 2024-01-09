package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2};
		
		int[] uniqueArrays = Arrays.stream(arr).distinct().toArray();
		
		System.out.println(Arrays.toString(uniqueArrays));
		
	}

	

}
