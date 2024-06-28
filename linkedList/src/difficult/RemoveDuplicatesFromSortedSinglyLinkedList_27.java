package difficult;

import easy.LinkedListUtil;
import easy.Node;

public class RemoveDuplicatesFromSortedSinglyLinkedList_27 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		//head.next.next.next.next.next = new Node(30);
		removeDuplicates(head);
		removeDuplicatesTest(head);
		LinkedListUtil.traverseHead(head);

	}

	private static void removeDuplicates(Node head) {
		if (head == null) {
			return;
		}
		Node slow = head;
		Node fast = slow.next;
		while (fast != null) {
			if (fast.data == slow.data) {
				slow.next = fast.next;
				fast = slow.next;
			} else {
				slow = slow.next;
				fast = slow.next;
			}
		}
	}

	private static void removeDuplicatesTest(Node head) {
		
		//Node currentNode= head;
		Node slow=head;
		Node fast=head;
		while(fast!=null){
			if(fast.data!=slow.data){
				slow.next=fast;
				slow=slow.next;
				fast=fast.next;;
			}else{
			fast=fast.next;
			}
		}
		slow.next=fast;
	}

}
