package medium;

import easy.LinkedListUtil;
import easy.Node;

/*
variation question is to find fisrt node of the loop */

public class DetectAndRemoveLoopInLinkedList_30 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head.next;
		detectAndRemoveLoop(head);
		LinkedListUtil.traverseHead(head);

	}

	private static void detectAndRemoveLoop(Node head) {

		if (head == null)
			return;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}

		}
		//return if there is no loop
		if (slow != fast)
			return;

		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

}
