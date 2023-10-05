package easy;
/*
1.	Depth First traversal 
2.	Level Order traversal or Breadth First traversal

Traverse Root
Traverse LeftSub Tree
Traverse Right sub Tree

It can be done in 3 ways

In order -- Left, Root, Right
Pre Order -- Root, Left, right
Post Order -- left, right, root
*
*/
public class TreeTraversal_1 {

	public static void main(String[] args) {
		
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		
		//InOrder
		inOrderTraversal(root);
		
		//preOder
		preOrdeeTraversal(root);
		
		//postOrder
		postOrderTraversal(root);
		
		
	}
	
	private static void inOrderTraversal(Node root) {
		/*if(root==null)
		return;*/
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}

	}
	
	private static void preOrdeeTraversal(Node root) {

		if (root != null) {
			System.out.println(root.data);
			preOrdeeTraversal(root.left);
			preOrdeeTraversal(root.right);
		}

	}

	private static void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}

}
