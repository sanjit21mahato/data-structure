package medium;

import easy.LinkedListUtil;
import easy.Node;

/*Here, we are given a sorted linked list and data x,
Need to insert such that linked list remains sorted.
*/

public class SortedInsertInSinglyLinkedList_22 {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		
		//head= sortedInsert(head, 25);
		head = sortedInsertEfficient(head,31);
		LinkedListUtil.traverseHead(head);

	}
	
	private static Node sortedInsertEfficient(Node head, int data) {
		   Node temp = new Node(data);
	       if(head==null){
	    	   head= new Node(data);
	       }
	       if(head.data>data) {
	    	  temp.next=head;
	    	  head=temp;
	       }
	       else{
	    	   Node currentNode = head;
	    	   while(currentNode.next!=null && currentNode.next.data<data){
	    		   currentNode =currentNode.next;
	    	   }
	    	   temp.next=currentNode.next;
	    	   currentNode.next=temp;
	       }

			return head;
		}

	private static Node sortedInsert(Node head, int data) {
		Node currentNode = head;
		Node previous = null;
		if(head==null){
	    	   head= new Node(data);
	    	   return head;
	    }
		if (currentNode.data > data) {
			Node newNode = new Node(data);
			newNode.next = currentNode;
			head = newNode;
		} else {
			while (currentNode != null) {
				if (currentNode.data > data) {
					Node newNode = new Node(data);
					newNode.next = currentNode;
					previous.next = newNode;
					break;
				}
				previous = currentNode;
				currentNode = currentNode.next;
			}
		}
		if(currentNode==null){
			if (data>previous.data) {
				Node newNode = new Node(data);
				previous.next = newNode;
				
			}
		}
		return head;
	}

}
