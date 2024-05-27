package difficult;

import easy.Node;

public class FixBSTWithTwoNodesSwapped_13 {
	static Node previous;
	static Node first;
	static Node second;

	public static void main(String[] args) {

		Node root = new Node(20);
		root.left = new Node(60);
		root.right = new Node(80);
		root.left.left = new Node(4);
		root.left.right = new Node(10);
		root.right.left = new Node(8);
		root.right.right = new Node(100);
		fixBSTWithTwoNodesSwapped(root);
		
		inOrderTraversal(root);

		System.out.println("First: " + first.key);
		System.out.println("Second: " + second.key);
		
		int temp =first.key;
		first.key=second.key;
		second.key=temp;
		
		//inOrderTraversal(root);
		

	}

	private static void fixBSTWithTwoNodesSwapped(Node root) {
		if (root == null) {
			return;
		}

		fixBSTWithTwoNodesSwapped(root.left);
		if (previous != null && root.key < previous.key) {
			if (first == null) {
				first = previous;
			}
			second = root;
		}
		previous = root;
		fixBSTWithTwoNodesSwapped(root.right);

	}

	
	private static void inOrderTraversal(Node root) {

		if (root == null)
			return;
		else {
			inOrderTraversal(root.left);
			System.out.println(root.key);
			inOrderTraversal(root.right);
		}

	}
}
