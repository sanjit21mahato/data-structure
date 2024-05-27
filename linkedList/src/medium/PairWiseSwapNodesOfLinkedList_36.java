package medium;

import easy.LinkedListUtil;
import easy.Node;

//pair wise swap is same like reversing in groups where group size =2 
public class PairWiseSwapNodesOfLinkedList_36 {

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		//head1.next.next.next.next = new Node(5);
		
		pairWiseSwap(head1);
		LinkedListUtil.traverseHead(head1);

	}
	
	private static void pairWiseSwap(Node head) {
		if (head == null)
			return;
		if (head.next == null)
			return;
		Node cn = head;
		while (cn!=null && cn.next != null) {
			int temp = cn.data;
			cn.data = cn.next.data;
			cn.next.data = temp;
			cn = cn.next.next;
		}
	}

}
