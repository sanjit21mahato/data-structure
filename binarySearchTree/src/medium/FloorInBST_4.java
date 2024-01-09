/**
Floor of a given key in BST is the closest smaller value of the key
i.e. the largest value smaller than key
 */
package medium;

/**
 * @author sanjit
 *
 */
public class FloorInBST_4 {

	static Node res = null;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right = new Node(30);

		Node floor = findFloorOfBST(root, 23);

	}

private static Node findFloorOfBST(Node root, int key) {
		while (root != null) {
			if (root.key == key)
				return root;
			else if (key < root.key) {
				root = root.left;
			} else if (key > root.key) {
				res = root;
				root = root.right;
			}
		}	
		return res;
	}
	
	/*private static Node findFloorOfBST(Node root, int key) {
		if (root == null) {
			return res;
		} else if (root.key == key)
			return root;
		else if (key < root.key) {
			root = findFloorOfBST(root.left, key);
		} else if (key > root.key) {
			res = root;
			root = findFloorOfBST(root.right, key);
		}

		return res;
	}*/

}
