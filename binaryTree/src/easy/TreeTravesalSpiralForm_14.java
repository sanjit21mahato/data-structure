/*
 * Tree Traversal in spiral form means, traverse root and then from right to left
	  and then from left to right and then from right to left
*/	  
package easy;

import java.util.Stack;

/**
 * @author sanjit
 *
 */
public class TreeTravesalSpiralForm_14 {


	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		printTreeInSpiralForm(root);

	}

	private static void printTreeInSpiralForm(Node root) {
      
		if(root==null){
			return;
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while(s1.isEmpty()==false || s2.isEmpty()==false){
			
			while(s1.isEmpty()==false){
				Node currentNode= s1.pop();
				System.out.println(currentNode.data);
				if(currentNode.left!=null){
					s2.push(currentNode.left);
				}
				if(currentNode.right!=null){
					s2.push(currentNode.right);
				}
			}
			while(s2.isEmpty()==false){
				Node currentNode= s2.pop();
				System.out.println(currentNode.data);
				if(currentNode.right!=null){
					s1.push(currentNode.right);
				}
				if(currentNode.left!=null){
					s1.push(currentNode.left);
				}
			}
			
		}
		
	}

}
