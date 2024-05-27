package easy;

/*
Two solutions
Naive: O(n)
Efficient O(1)

*/

public class DeleteHeadOfCircularLinkedList_19 {

	public static void main(String[] args) {

		Node head = new Node(10);
		Node n2 = new Node(20);
		head.next = n2;
		Node n3 = new Node(30);
		n2.next = n3;
		n3.next = head;

		head = deleteHeadCircularLinkedListEfficiently(head);
		CircularLinkedListTraversal_16.traverseCircularLinkedList(head);

	}

	// O(1)
	private static Node deleteHeadCircularLinkedListEfficiently(Node head) {

		if (head == null) {
			return null;
		}
		if (head.next == head) {
			return null;
		} else {
			head.data = head.next.data;
			head.next = head.next.next;
		}
		return head;
	}

	// O(n)
	private static Node deleteHeadCircularLinkedList(Node head) {

		if (head == null) {
			return null;
		}
		if (head.next == head) {
			return null;
		} else {
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = head.next;
			head = head.next;
		}
		return head;
	}

}
