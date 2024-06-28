/*
TreeSet is implementation of Self Balanced Binary Tree(Red Black Tree)
It supports search, insert , delete similar to HashSet,
but in HashSet we do not have functions (floor, celing, lower, higher) 
which are there in TreeSet.
When we Traverse the TreeSet we get the items in sorted order
Floor of an element: is the element itself or closest smaller element.
Ceiling of an element: is the element itself or closet greater element. 
*/
package easy;

import java.util.TreeSet;

/**
 * @author sanjit
 *
 */
public class TreeSetBasics_2 {

	
	public static void main(String[] args) {
		
		 TreeSet<String> treeSet = new TreeSet<>();
	       treeSet.add("def");
	       treeSet.add("abc");
	       treeSet.add("ghi");
	       
	       System.out.println(treeSet);
	       for (String s : treeSet) {
			System.out.println(s);
		   }
	       
	       TreeSet<Integer> tsi = new TreeSet<>();
	       tsi.add(10);
	       tsi.add(5);
	       tsi.add(25);
	       tsi.add(15);
	       tsi.add(20);
	       System.out.println(tsi);
	       System.out.println(tsi.lower(17));
	       System.out.println(tsi.higher(17));
	       System.out.println(tsi.floor(14));
	       System.out.println(tsi.ceiling(15));
	       System.out.println(tsi.floor(17));
	       System.out.println(tsi.ceiling(17));

	}

}
