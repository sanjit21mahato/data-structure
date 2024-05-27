/**
 A complete Binary tree is a tree which is completely filled at all levels except the last level and
 in the last level it should be filled from left to right 
 */
package difficult;

import easy.Node;

/**
 * @author sanji
 *
 */
public class CountNodesInCompleteBinaryTree_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		/*root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);*/
		
	    //Naive Solution
		int count = countNodes(root);
		System.out.println(count);

	}

	private static int countNodes(Node root) {
		if(root==null){
			return 0;
		}
		return 1+countNodes(root.left)+countNodes(root.right);
	}

}
