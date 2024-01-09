/*
TreeMap is implementation of RBT
TreeMap is used to store key value pair
TreeMap provides additional functionalities like higherKey, lowerKey, floorKey, ceilingKey etc 
than HashMap
TreeMap also implements map interface, SortedMap Interface
TreeMap is sorted based on keys

*/

package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapBasics_3 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Sanjit");
		tm.put(3, "Ranjit");
		tm.put(2, "Anjit");


		for (Map.Entry<Integer, String> e : tm.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());

		}
		System.out.println(tm.higherKey(2));
		System.out.println(tm.lowerKey(2));
		System.out.println(tm.floorKey(4));
		System.out.println(tm.ceilingKey(2));
		
		System.out.println(tm.get(tm.higherKey(2)));

		
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Sanjit");
		hm.put(3, "Ranjit");
		hm.put(2, "Anjit");

	}

}
