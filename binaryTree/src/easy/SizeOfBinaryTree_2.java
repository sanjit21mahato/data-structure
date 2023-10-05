package easy;
//Size of Binary Tree is the number of nodes in a binary tree
public class SizeOfBinaryTree_2 {

	public static void main(String[] args) {
		
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right= new Node(50);
		
		int size= findSizeOfBTree(root);
		System.out.println(size);


	}

	private static int findSizeOfBTree(Node root) {

		if (root == null) {
			return 0;
		} else {
			return 1 + findSizeOfBTree(root.left) + findSizeOfBTree(root.right);
		}
	}

}
