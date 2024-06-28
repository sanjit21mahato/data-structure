package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class TopViewOfBST {
	

	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(50);
		root.left.left=new Node(30);
		root.left.right=new Node(40);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		Map<Integer, List<Integer>> map = new TreeMap<>();
		topView(root, map,0);
		map.forEach((k,v)-> {
			System.out.println(v);
		});
		
		
		
	}

	private static void topView(Node root, Map<Integer, List<Integer>> map, int hd) {
		
		if(root==null){
			return;
		}else{
			if(map.containsKey(hd)==false){
				List<Integer> list = new ArrayList<>();
				list.add(root.data);
				map.put(hd, list);
			}
			topView(root.left,  map, hd-1);
			topView(root.right, map, hd+1);		
		}
		
	}

	
	
	


}
