package difficult;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

import easy.Node;

/*Two solutions:
	1. Using InOrder Traversal and using stack
	2. Using Level order traversal and using ArrayList and Pair
*/

class Pair1{
	Node node;
	int hd;
	Pair1(Node n, int h){
		node=n;
		hd=h;
	}
}
public class VerticalTraversalOfBinaryTree_16 {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(50);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		
		//Solution1
		/*Map<Integer,Stack<Integer>> map= new TreeMap<Integer,Stack<Integer>>();
		verticalTraversalOfBinaryTree(root,0,map);
		
		for (Map.Entry<Integer, Stack<Integer>> entry : map.entrySet()) {
			Stack<Integer>stack = entry.getValue();
			while(stack.size()>0){
				System.out.println(stack.pop());
			}
		}*/

		//Solution2
		int hd =0;
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		verticalTraversalofBinaryTreeUisngLevelOrderT(root,map);
		
		for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
			System.out.println(entry.getValue());
		}

	}

	private static void verticalTraversalofBinaryTreeUisngLevelOrderT(Node root,
			Map<Integer, List<Integer>> map) {
		if(root==null){
			return;
		}else {
			Queue<Pair1> q = new LinkedList<Pair1>();
			q.add(new Pair1(root, 0));
			while (q.isEmpty() == false) {
				Pair1 p = q.poll();
				Node c = p.node;
				int h = p.hd;

				if (map.containsKey(h)) {
					map.get(h).add(c.key);
				} else {
					List<Integer> list = new ArrayList<Integer>();
					list.add(c.key);
					map.put(h, list);
				}

				if (c.left != null) {
					q.add(new Pair1(c.left, h - 1));
				}
				if (c.right != null) {
					q.add(new Pair1(c.right, h + 1));
				}
			}
			
		}
		
	}

	private static void verticalTraversalOfBinaryTree(Node root, int hd, Map<Integer, Stack<Integer>> map) {


		if(root==null)return;
		
		if(root.left!=null){
			verticalTraversalOfBinaryTree(root.left, hd-1, map);
		}
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2=  map.get(hd);
		if(s2==null){
			s1.add(root.key);
			map.put(hd, s1);
		}else{
			s2.add(root.key);
			map.put(hd, s2);
		}
		
		if(root.right!=null){
			verticalTraversalOfBinaryTree(root.right, hd+1, map);
		}
		
	}

}
