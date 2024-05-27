/**
 * 
 */
package medium;

import java.util.LinkedList;
import java.util.Queue;

import easy.Node;

/**
 * @author sanjit
 *
 */


public class MaximumWidthOfBinaryTree_9 {
	
	static int maxWidth=0;

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(35);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		
		findMaxWidthOfBTree(root);
		findMaxWidthOfBtree1(root);
		System.out.println(maxWidth);
		

	}	

	private static void findMaxWidthOfBTree(Node root) {
		
		 if(root==null){
	        	return;
	        }
	        Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while (q.size()>1) {
				int size = q.size();
				Node currentNode = q.poll();
				if(currentNode==null){
				    maxWidth =Math.max(size-1, maxWidth);
					q.add(null);
					continue;
				}else{
					if (currentNode.left != null) {
						q.add(currentNode.left);
					}
					if (currentNode.right != null) {
						q.add(currentNode.right);
					}
				}
			}
		
       /* if(root==null){
        	return;
        }
        Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty()==false) {
			int size = q.size();
			maxWidth =Math.max(size, maxWidth);
			for(int i=0;i<size;i++){
				Node currentNode = q.poll();
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
		}*/
		
	
	}
	
	private static void findMaxWidthOfBtree1(Node root) {
		int count =0;
		if(root==null){
			return;
		}
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.size()>1){
			Node currentNode = q.poll(); 
			if(currentNode==null){
				if(count>maxWidth){
					maxWidth= count;
				}
				q.add(null);
				count=0;
			}else{
			
			if(currentNode.left!=null){
				q.add(currentNode.left);
				count++;
			}
			if(currentNode.right!=null){
				q.add(currentNode.right);
				count++;
			}
			}
			
		}
		
	}

}
