package easy;

public class CircularLinkedListTraversal_16 {

	public static void main(String[] args) {
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=head; 
        traverseCircularLinkedList(head);

	}

	protected static void traverseCircularLinkedList(Node head) {
		if (head != null) {
			Node currentNode = head;
			System.out.println(currentNode.data);
			while (currentNode.next != head) {
				currentNode = currentNode.next;
				System.out.println(currentNode.data);
			}

		}
	}

}
