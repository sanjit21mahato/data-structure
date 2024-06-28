package difficult;
/*
Two Solutions:
	Recursive 
	Iterative
*/

import easy.LinkedListUtil;
import easy.Node;

public class ReverseSinglyLinkedListInGroups_28 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(70);
		int k = 3;
		//head = reverseInGroupsUsingRecursion(head, k);
		head=reverseInGroups(head,k);
		LinkedListUtil.traverseHead(head);
	}

	private static Node reverseInGroupsUsingRecursion(Node head, int k) {
		/*if (head == null)
			return null;
		Node previous = null;
		Node next = null;
		Node current = head;

		for (int i = 0; i < k; i++) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		if (current != null) {
			Node headRest = reverseInGroupsUsingRecursion(current, k);
			head.next = headRest;
		}
		return previous;*/
		

		
		if(head==null){
			return null;
		}
		Node currentNode =head;
		Node previous=null;
		Node next=null;
		int count =k;
		while(count!=0 && currentNode!=null){
			next=currentNode.next;
			currentNode.next=previous;
			previous=currentNode;
			currentNode=next;
			count--;
		}
		if(currentNode!=null){
		Node headRest =reverseInGroupsUsingRecursion(currentNode, k);
		head.next = headRest;
		}
		return previous;
	
	}	
    //Need some correction
	private static Node reverseInGroups(Node head, int k) {

		if (head == null) {
			return null;
		}
		int count = 0;
		Node temp = null;
		Node currentNode = head;
		Node previous = null;
		Node next = null;
		while (currentNode != null && count<=k) {
			if (count == k) {
				count = 0;
			}
			if (count == 0) {
				temp = currentNode;
			}
			next = currentNode.next;
			currentNode.next = previous;
			previous = currentNode;
			currentNode = next;
			if (count == (k - 1)) {
				temp.next=currentNode;
				
				/*head = previous;
				previous=temp;*/
			}
			count++;

		}
		return head;
	}
}
