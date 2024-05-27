/*
 * For each node if sum of left root and right root of each node is equal to root.
 * Also root which does not have left and right node is considered balanced. 
 *  */
package easy;

/**
 * @author sanjit
 *
 */
public class ChildrenSumProperty_12 {

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(9);
		root.left.right = new Node(13);

		boolean isChildrenSum = checkForChidrenSum(root);
		System.out.println(isChildrenSum);

	}

	private static boolean checkForChidrenSum(Node root) {
		if (root == null || (root.left==null && root.right==null)) {
			return true;
		} else {
			int sum = 0;
			if (root.left != null) {
				sum = sum + root.left.data;
			}
			if (root.right != null) {
				sum = sum + root.right.data;
			}
			return (root.data == sum && checkForChidrenSum(root.left) && checkForChidrenSum(root.right));
		}

	}

}
