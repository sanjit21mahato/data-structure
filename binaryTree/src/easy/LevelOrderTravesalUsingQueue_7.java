/**
 * 
 */
package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sanjit
 *
 */
public class LevelOrderTravesalUsingQueue_7 {

	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		levelOrderTravesal(root);

	}

	private static void levelOrderTravesal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if (root == null) {
			return;
		} else {
			q.add(root);
			while (q.isEmpty() == false) {
				// while (q.size()>0) {
				Node currentNode = q.poll();
				System.out.println(currentNode.data);
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
		}
	}

}
