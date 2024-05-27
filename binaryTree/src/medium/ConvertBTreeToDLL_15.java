/**
 * 
 */
package medium;

import easy.Node;

/**
 * @author sanjit
 *
 */
public class ConvertBTreeToDLL_15 {
	
     static Node head=null;
     static Node previous=null;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		
		head = convertBTreeToDLL(root);
		traverseDLL(head);
		

	}

	private static Node convertBTreeToDLL(Node root) {
		
		if (root == null)
			return null;

		convertBTreeToDLL(root.left);
		if (previous == null) {
			head = root;
		} else {
			root.left = previous;
			previous.right = root;
		}
		previous = root;

		convertBTreeToDLL(root.right);
		return head;
	}

	private static void traverseDLL(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.right;
		}
	}
}
