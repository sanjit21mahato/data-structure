package medium;
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
		head = reverseInGroupsUsingRecursion(head, k);
		//head=reverseInGroups(head,k);
		LinkedListUtil.traverseHead(head);
	}

	private static Node reverseInGroupsUsingRecursion(Node head, int k) {
		if (head == null)
			return null;
		Node pre = null;
		Node next = null;
		Node c = head;

		for (int i = 0; i < k; i++) {
			next = c.next;
			c.next = pre;
			pre = c;
			c = next;
		}
		if (c != null) {
			Node headRest = reverseInGroupsUsingRecursion(c, k);
			head.next = headRest;
		}
		return pre;
	}	

	/*private static Node reverseInGroups(Node head, int k) {

		if (head == null) {
			return null;
		}
		int count = 0;
		Node temp = null;
		Node currentNode = head;
		Node previous = null;
		Node next = null;
		while (currentNode != null && count<k) {
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
				head = previous;
				previous=temp;
			}
			count++;

		}
		return head;
	}*/
}
