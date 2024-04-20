/**
 * 
 */
package medium;

import easy.LinkedListUtil;
import easy.Node;


/**
 * @author sanji
 *
 */
public class ReverseDoublyLinkedList_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		    Node head=new Node(10);
		    head.previous=null;
		    Node n2= new Node(20);
		    head.next=n2;
		    n2.previous=head;
		    Node n3= new Node(30);
		    n2.next=n3;
		    n3.previous=n2;
		    n3.next=null;
		    
		   LinkedListUtil.traverseHead(head);
		   head=reverseDoublyLinkedList(head);
		   LinkedListUtil.traverseHead(head);

	}

	private static Node reverseDoublyLinkedList(Node head) {
		
		if(head==null || head.next==null){
			return head;
		}
		
       /* Node currentNode=head;
        Node previous=null;
        while(currentNode!=null){
        	currentNode.previous=currentNode.next;
        	currentNode.next=previous;
        	previous=currentNode;
        	currentNode=currentNode.previous;
        }
		return previous;*/
		
		Node currentNode = head;
		Node previous =null;
	
		while(currentNode!=null){
		 previous = currentNode.previous;
		 currentNode.previous = currentNode.next;
		 currentNode.next=previous;
		 currentNode = currentNode.previous;
			
		}
		return previous.previous;
	}

}
