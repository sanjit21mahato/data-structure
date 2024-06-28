package easy;

public class DeleteKthOfCircularLinkedList_20 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;

		// traverse(head);

		head = deleteKthNode(head, 1);
		CircularLinkedListTraversal_16.traverseCircularLinkedList(head);

	}

	private static Node deleteKthNode(Node head, int k) {
		if (head == null) {
			return null;
		}
		if (k == 0) {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		} else {
			Node currentNode = head;
			for (int i = 1; i < k; i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
			return head;
		}
	}

}
