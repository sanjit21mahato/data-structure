package medium;

import java.util.HashSet;
import java.util.Set;

import easy.Node;

/*Method1: 
	Do inorder traversal of BST and store in array which will be sorted since 
	inorder traversal of BST is always sorted.
	Then use two pointer approach in find pair sum in sorted order
	O(n)/O(n)
Method2:
    By maintaining hashSet and checking in the table if sum-node key is present in the set
    while traversing inorder traversal,if its present then there is pair sum

	*/

public class PairSumWithGivenSum_14 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(20);
		root.left.left = new Node(4);
		root.left.right = new Node(9);
		root.right.left = new Node(11);
		root.right.right = new Node(30);
		root.right.right.left = new Node(25);
		int pairSum = 34;
		Set<Integer> hashSet = new HashSet<>();
		boolean isPairSum=checkPairSum(root, pairSum, hashSet);
		System.out.println(isPairSum);

	}
		
		private static boolean checkPairSum(Node root, int pairSum, Set<Integer> hashSet) {

			if (root == null) {
				return false;
			}
			if (checkPairSum(root.left, pairSum, hashSet) == true) {
				return true;
			}
			if (hashSet.contains(pairSum - root.key)) {
				return true;
			} else {
				hashSet.add(root.key);
			}
			if (checkPairSum(root.right, pairSum, hashSet) == true) {
				return true;
			}
			return false;
		}

}
