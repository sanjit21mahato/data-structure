package difficult;

import java.util.Map;
import java.util.TreeMap;

import easy.Node;

public class VerticalSumInBinaryTree_15 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(30);
		root.left.right = new Node(40);

		printVerticalSum(root);
	}

	private static void printVerticalSum(Node root) {
		int horizontalDistance = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		calCulateVeritcalSum(root, horizontalDistance, map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

	private static void calCulateVeritcalSum(Node root, int horizontalDistance, 
			                                            TreeMap<Integer, Integer> map) {
		
		if(root==null){
			return;
		}
		calCulateVeritcalSum(root.left, horizontalDistance-1, map);
		map.put(horizontalDistance, map.getOrDefault(horizontalDistance, 0)+root.key);
		calCulateVeritcalSum(root.right, horizontalDistance+1, map);
		

	}
}
