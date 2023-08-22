package difficult;

import java.util.Set;
import java.util.TreeSet;

/*i/p: arr1 :{7,1,5,2,3,6};
     arr2  : {3,8,6,20,7};
     
     O/P : Union {1,2,3,5,6,7,8,20};
           Intersection {3,6,7};*/

// Notes: Treeset store the values by maintaning sorting

public class UnionAndIntersectionOfUnsortedArrays_30 {

	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3, 6 ,3};
		int arr2[] = { 3, 8, 6, 20, 7 ,3};

		findUnion(arr1, arr2);
		findIntersection(arr1, arr2);
		countIntersectionOfDistinct(arr1, arr2);

	}

	

	private static void findUnion(int[] arr1, int[] arr2) {

		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		System.out.println(set.toString());
	}

	
	private static void findIntersection(int[] arr1, int[] arr2) {

		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				set2.add(arr2[i]);
			}
		}
		System.out.println(set2.toString());
	}
	
	private static void countIntersectionOfDistinct(int[] arr1, int[] arr2) {
		Set<Integer> set = new TreeSet<>();
		//Set<Integer> set2 = new TreeSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		int count =0;
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				count++;
				set.remove(arr2[i]);
			}
		}
		System.out.println(count);
		
	}

}
