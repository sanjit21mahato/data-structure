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
		/*Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.left.left = new Node(50);*/
	
		/*Node root = new Node(0);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);*/
		
		Node root = new Node(0);
		root.left = new Node(2);
		root.right = new Node(4);
		root.left.left = new Node(1);
		root.right.left = new Node(3);
		root.right.right = new Node(-1);
		root.left.left.left= new Node(5);
		root.left.left.right= new Node(1);
		/*root.right.left.right = new Node(6);
		root.right.right.right= new Node(8);*/
		
		boolean isBalancedTree =checkBalanced(root);
		System.out.println(isBalancedTree);

	}

	private static boolean checkBalanced(Node root) {
		
		int height=chekHeights(root);
		if(height<0){
			return false;
		}else{
			return true;
		}
	}
	
	private static int chekHeights(Node root) {
		if(root==null){
			return 0;
		}
		int lh = chekHeights(root.left);
		if(lh==-1)return -1;
        int rh = chekHeights(root.right);
        if(rh==-1)return -1;
        //point to be noted will go in else only when if does not return -1
        if(Math.abs(lh-rh)>1){
			return -1;
        }
        else{
		    return 1+Math.max(lh, rh);
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
