/**
/*Data structure that does
insert, search, delete and find kth smallest effieciently.

Two solution: naive solution using BST traversal O(n),
            : efficient solution by modifying Node of a BST ie augmented BST O(h) 

*/
package medium;

/**
 * @author sanjit
 *
 */
public class KthSmallestElementInBST_11 {
    static int count=0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		int k = 3;
		findKthSmallestElement(root, k);
	}

	private static void findKthSmallestElement(Node root, int k) {
		if (root != null) {

			findKthSmallestElement(root.left, k);
			count++;
			if (count == k) {
				System.out.println(root.key);
				return;
			}
			findKthSmallestElement(root.right, k);
			
		}

	}

}
