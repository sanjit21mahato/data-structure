package medium;

import easy.LinkedListUtil;
import easy.Node;

public class ReverseSinglyLinkedListIterative_25 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(35);
		head.next.next.next.next = new Node(40);

		head = reverseSinglyLinkedList(head);
		LinkedListUtil.traverseHead(head);

	}

	private static Node reverseSinglyLinkedList(Node head) {
		if (head == null) {
			return head;
		} else {
			Node previous = null;
			Node next = null;
			Node currentNode = head;
			while (currentNode != null) {
				next = currentNode.next;
				currentNode.next = previous;
				previous = currentNode;
				currentNode=next;
			}
			head=previous;
			return head;
		}
	}

}
