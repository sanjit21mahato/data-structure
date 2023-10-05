/*In a Balanced Binary Tree for every node, the difference between heights of left subtree 
and right subtree should not be more than one.

Two Solutions
*/
package medium;

import easy.Node;

/**
 * @author sanjit
 *
 */
public class CheckForBalanceBinaryTree_11 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.left.left = new Node(50);
		/*
		 * this method returns -1 for unbalanced binary tree here if res =-1
		 * then it is not balanced for non-negative value it is balanced
		 */
		int res	= checkForBalancedBTree(root);
		if(res<0){
			System.out.println("B Tree is not balanced");
		}else{
			System.out.println("B Tree is Balanced");
		}

	}

	private static int checkForBalancedBTree(Node root) {
       
		if(root==null){
			return 0;
		}
		int lh = checkForBalancedBTree(root.left);
		if(lh==-1)return -1;
        int rh = checkForBalancedBTree(root.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1){
			return -1;
        }
        else{
		    return 1+Math.max(lh, rh);
        }
		

	}

}
