/*Left view of binary tree is the nodes that are visible from left side
 * 
 * Solution1 : Recurssive
 * Solution2 : Iterative */
package medium;

import java.util.LinkedList;
import java.util.Queue;

import easy.Node;

/**
 * @author sanjit
 *
 */
public class PrintLeftViewOfBinaryTree_10 {


	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(35);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.right = new Node(60);
		
		printLeftViewOfBTree(root);
		
	}

	private static void printLeftViewOfBTree(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		if (root == null) {
			return;
		} else {
			q.add(root);
			while (q.isEmpty() == false) {
				int size = q.size();
				for(int i=0;i<size;i++){
					Node currentNode = q.poll();
					if(i==0){
					 System.out.println(currentNode.data);
					}
					if (currentNode.left != null) {
						q.add(currentNode.left);
					}
					if (currentNode.right != null) {
						q.add(currentNode.right);
					}
				}
				
			}
		}
		
		/*Queue<Node> q = new LinkedList<Node>();
		if(root==null)return;
		else{
			q.add(root);
			q.add(null);
			System.out.println(root.data);
			while(q.size()>1){
                Node cn= q.poll();
                if(cn==null){
                	System.out.println(q.peek().data);
                	q.add(null);
                }else{
                	if(cn.left!=null){
                		q.add(cn.left);
                	}
                	if(cn.right!=null){
                		q.add(cn.right);
                	}
                }
			}
		}*/
		
	}

}
