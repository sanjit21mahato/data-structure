package easy;
/*Two solutions:
1. Naive O(n) using traversal , also by appling a trick O(1)
2. Efficient O(1) 
   By Maintaining tail in LinkeList node structure and pass tail as argument along with
   head and data
*/

public class InsertAtEndCircularLinkedList_18 {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node n2 = new Node(20);
		head.next = n2;
		Node n3 = new Node(30);
		n2.next = n3;
		n3.next = head;

		head= insertAtEndCircularLinkedList(head, 40);
		CircularLinkedListTraversal_16.traverseCircularLinkedList(head);
		
	}

	private static Node insertAtEndCircularLinkedList(Node head, int data) {
		Node newNode =new Node(data);
		int temp = head.data;
		head.data= newNode.data;
		newNode.data=temp;
		
		newNode.next=head.next;
		head.next=newNode;
		head=newNode;
		
		return head;
	}

}
