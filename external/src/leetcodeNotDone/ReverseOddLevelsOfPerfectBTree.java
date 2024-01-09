/**
Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.
For example, suppose the node values at level 3 are [2,1,3,4,7,11,29,18], then it should become [18,29,11,7,4,3,1,2].
Return the root of the reversed tree.
A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.
The level of a node is the number of edges along the path between it and the root node.
Ex1: I/N
              2
           3       5
         8   13  21  24
         
O/P:
               2
           5       3
         8   13  21  24  
Explanation: 
The tree has only one odd level.
The nodes at level 1 are 3, 5 respectively, which are reversed and become 5, 3.                         
 */
package leetcodeNotDone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import conceptCoding.TreeNode;

/**
 * @author sanjit
 *
 */
public class ReverseOddLevelsOfPerfectBTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(13);
		root.right.left = new TreeNode(21);
		root.right.right = new TreeNode(34);

		reverseNodeAtOddLevels(root);
		System.out.println(root);

	}

	private static void reverseNodeAtOddLevels(TreeNode root) {
		reverseNodeAtOddLevels(root.left,root.right,1);
	}

	private static void reverseNodeAtOddLevels(TreeNode left, TreeNode right, int level) {
		
		if(left==null && right==null){
			return;
		}
		
		if(level%2!=0){
			int temp=left.value;
			left.value=right.value;
			right.value=temp;
		}
		
		reverseNodeAtOddLevels(left.left,right.right,level+1);
		
		reverseNodeAtOddLevels(left.right,right.left,level+1);
		
	}

}
