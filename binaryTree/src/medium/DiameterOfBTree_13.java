/*
 * Using height function we can get diameter of B Tree
 * */
package medium;

import easy.Node;

/**
 * @author sanjit
 *
 */
public class DiameterOfBTree_13 {
	
	static int diameter =0;

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(9);
		//root.left.right = new Node(13);
		//root.left.left.left = new Node(6);
		//res is height of B tree
		int res = findDiameterOfBTree(root);
		System.out.println(diameter);

	}

	private static int findDiameterOfBTree(Node root) {
        if(root==null){
        	return 0;
        }
        int lh = findDiameterOfBTree(root.left);
        int rh = findDiameterOfBTree(root.right);
        diameter = Math.max(diameter, 1+lh+rh);

		return 1+Math.max(lh, rh);
	}

}
