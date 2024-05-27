package medium;
/*
If there are odd no of elements in linked list then print middle element 
in case of even no of elements print second middle.

Naive Solution:
traverse the linked list and count the no of elements
and then traverse again upto count/2 and find the element.
It makes two traversal O(n)

Efficient Solution: find middle element in only one traversal

*/

import easy.Node;

public class MiddleOfSinglyLinkedList_23 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(35);
		head.next.next.next.next= new Node(40);
		
		int res= findMiddle(head); 
		System.out.println(res); 

	}

	private static int findMiddle(Node head) {
		if(head==null){
			return -1;
		}
		else {
			Node slowNode = head;
			Node fastNode=head;
			while(fastNode!=null && fastNode.next!=null){
				fastNode=fastNode.next.next;
				slowNode = slowNode.next;
			}
			return slowNode.data;
			
		}
	}

}
