package difficult;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import easy.Node;

class DLLNode {
	int data;
	DLLNode previous;
	DLLNode next;

	DLLNode(int data) {
		this.data = data;
	}
}

public class Test {
  static DLLNode head = null;
  static DLLNode previous=null;
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);

		head = convertBTreeToDLL(root);
        traverseDLL(head);

	}

	private static DLLNode convertBTreeToDLL(Node root) {

		if (root == null) {
			return null;
		}
	    Node c= root;
        convertBTreeToDLL(c.left);
        DLLNode dllNode =new DLLNode(c.data); 
        if(head==null){
        	head= dllNode;
        }else{
        	previous.next=dllNode;
        	dllNode.previous=previous;
        }
        previous = dllNode;
        convertBTreeToDLL(root.right);
		
		return head;
	}
	
	private static void traverseDLL(DLLNode head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
