package medium;

import easy.LinkedListUtil;
import easy.Node;

public class TestLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(70);
		int k = 3;
		head = reverseInGroupsUsingRecursion(head, k);
		//head=reverseInGroups(head,k);
		LinkedListUtil.traverseHead(head);
	}

	private static Node reverseInGroupsUsingRecursion(Node head, int k) {
		
		if(head==null){
			return null;
		}
		Node currentNode =head;
		Node previous=null;
		Node temp=null;
		int count =k;
		while(count!=0 && currentNode!=null){
			temp=currentNode.next;
			currentNode.next=previous;
			previous=currentNode;
			currentNode=temp;
			count--;
		}
		if(currentNode!=null){
		Node headRest =reverseInGroupsUsingRecursion(currentNode, k);
		head.next = headRest;
		}
		return previous;
	}
}
