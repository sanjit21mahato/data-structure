/*
Binary Search Tree:
For every node keys in left are smaller and keys in right are greater
All keys are considered as distinct
Like linkedlist, it is a linked data structure.
It(Self Balanced BST) is implemented as TreeSet and TreeMap in Java.
  
Delete:
While deleting we need to ensure that after delete, the BST property is not violated
If the deleted node has both left and right children then we need to replace it with 
either closest smaller or closest higher value.
closest greater value in BST is the inorder successor.
It is the next node that comes in inorder traversal as Inorder in BST is always sorted.    
  
Insert , search, delete , closet are O(h)or O(n) in BST
In Balanced BST, these operations are O(logn)

*/

package medium;

public class BinarySearchTree_1 {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	// Constructor
	BinarySearchTree_1() {
		root = null;
	}

	// BinarySearchTree_1(int value) { root = new Node(value); }

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		// Otherwise, recur down the tree
		else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		BinarySearchTree_1 tree = new BinarySearchTree_1();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		
		
		boolean isPresent =tree.search(60);
		System.out.println(isPresent);
		
		tree.delete(30);
		tree.inorder();
	}
	

	private Node deleteInBST(Node root, int x) {
		if (root == null) {
			return null;
		}
		if (x < root.key) {
			root.left = deleteInBST(root.left, x);
		} else if (x > root.key) {
			root.right = deleteInBST(root.right, x);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				Node succ = findSuccessor(root);
				root.key = succ.key;
				root.right = deleteInBST(root.right, succ.key);
			}
		}
		return root;
	}

	private static Node findSuccessor(Node root) {
		Node currentNode = root.right;
		while(currentNode!=null && currentNode.left!=null) {
			currentNode = currentNode.left;
		}
        return currentNode;
	}

	private void delete(int data) {
		
		deleteInBST(root,data);
		
	}

	
	private boolean search(int data) {
		
		return searchInBST(root,data);
		
	}

	private boolean searchInBST(Node root, int data) {
		
		if(root==null){
			return false;
		}else {
			if(root.key==data){
				return true;
			}
			else if(data<root.key){
				return searchInBST(root.left,data);
			}else {
				return searchInBST(root.right,data);
			}
		}
	}
}