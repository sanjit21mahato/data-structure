/**
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author sanjit
 *
 */
/*
 * Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2} Output : 1 2 5 7 4 Explanation :
 * {1, 2} appear more than one time.
 * 
 */
public class RemoveDuplicatsFromUnsortedArray_6 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
		removeDuplicatesUsingSet(arr);
		removeDuplicatesUsingJava8(arr);

	}

	private static void removeDuplicatesUsingSet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		set.forEach(e -> System.out.print(e.intValue()));

	}
	
	private static void removeDuplicatesUsingJava8(int[] arr) {
		ArrayList<Integer> numbersList = new ArrayList(Arrays.asList(arr));

		List<Integer> list = numbersList.stream().distinct().collect(Collectors.toList());
		for (Integer i : list) {
			System.out.println(i);
		}
		// list.forEach(System.out::println);
		// System.out.println();

		int[] uniqueArrays = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(uniqueArrays));

	}

}
