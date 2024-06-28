package medium;

import easy.CircularLinkedListTraversal_16;
import easy.Node;

/*Two solotuion
1. traversal Big O(n) or
2. by applying a trick for O(1)
2. Big O(1)
   By mainiting tail in LinkedList Node 
    
*/

public class InsertAtBeginCircularLinkedlist_17 {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node n2 = new Node(20);
		head.next = n2;
		Node n3 = new Node(30);
		n2.next = n3;
		n3.next = head;

		head = insertAtBeginOfCircularLinkedList(head, 5);

		CircularLinkedListTraversal_16 traversal = new CircularLinkedListTraversal_16();
		//traversal.traverseCircularLinkedList(head);

	}

	private static Node insertAtBeginOfCircularLinkedList(Node head, int data) {

		if (head == null) {
			head = new Node(data);
			head.next = head;
		} else {
			Node newNode = new Node(data);
			int temp = newNode.data;
			newNode.data = head.data;
			head.data = temp;

			newNode.next = head.next;
			head.next = newNode;
		}
		return head;
	}

	// O(n) using traversal method to find the last element which refers to head
	private static Node insertAtBegin(Node head, int data) {
		if (head == null) {
			head = new Node(data);
			head.next = head;
		} else {
			Node temp = new Node(data);
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = temp;
			temp.next = head;
			head = temp;
		}

		return head;
	}

}
