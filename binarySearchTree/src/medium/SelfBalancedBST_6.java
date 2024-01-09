/*
In normal BST, the time complexity of operations in O(n) 
if the height is equal to number of items in a tree.
If we can maintain the height as logn instead of n , 
 complexity reduces to O(log n)
 So, Self Balanced BST makes sure that height does not equal to 
 no of nodes in a tree.
 If we know keys in advance we can make a perfectly Balanced BST
 How to keep it Balanced if random insertion/deletion happens?
 So, idea would be do to restructuring or re balancing when insertion and deletion happens
 The restructing is called rotation i.e.left rotation or right rotation depending on BST
 Rotation is just O(1) operation
 
 AVL Tree and Red Black Tree are two common self Balanced BST
 AVL Tree is restrict in balancing
 Red Black Tree is loose in Balancing so it has advantage of less restructuring
 Red Black Tree is more commonly used
 In java library Tree Set and Tree map , Red Black Tree is used.
  
 */
package medium;

/**
 * @author sanji
 *
 */
public class SelfBalancedBST_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
