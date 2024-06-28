package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;


/*class Node {
	
	public int data;
	public Node left;
	public Node right;
	
	 public Node(int data){
		this.data=data;
	}
}
*/
public class VerticalTraversalOfBST {
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		Map<Integer, List<Integer>> map = new TreeMap<>();
		verticalTraversal(root, map,0);
		map.forEach((k,v)-> {
			System.out.println(v);
		});
		
		
		
	}

	private static void verticalTraversal(Node root, Map<Integer, List<Integer>> map, int hd) {
		
		if(root==null){
			return;
		}else{
			if(map.containsKey(hd)){
				List<Integer> list = map.get(hd);
				list.add(root.data);
				map.put(hd, list);
			}else{
				List<Integer> list = new ArrayList<>();
				list.add(root.data);
				map.put(hd, list);
			}
			verticalTraversal(root.left,  map, hd-1);
			verticalTraversal(root.right, map, hd+1);		
		}
		
	}

	
	
	
}