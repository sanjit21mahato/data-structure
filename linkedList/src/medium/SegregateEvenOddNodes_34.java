package medium;
/*
Given singly LinkedList segregate even odd by maintaining the order of elements

17--15--8--12--5
8--12--17--15--5

Two solutions:
1. Traverse and find the last node
traverse again add odd nodes to last node and updaet last ndoe
It needs two traversal 
2. Using LinkedHashSet 
2. Efficient : Solve in one traversal

*/

import java.util.Iterator;
import java.util.LinkedHashSet;

import easy.LinkedListUtil;
import easy.Node;

public class SegregateEvenOddNodes_34 {

	public static void main(String[] args) {
		Node head = new Node(17);
		head.next = new Node(15);
		head.next.next = new Node(8);
		head.next.next.next = new Node(12);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(20);

		head = segregateEvenOddEfficient(head);
		//head = segregateEvenOdd(head);
		LinkedListUtil.traverseHead(head);

	}
	
	private static Node segregateEvenOddEfficient(Node head) {

		if (head == null) {
			return null;
		}
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node current = head;
		while (current != null) {
			if (current.data % 2 != 0) {
				if (oddStart == null) {
					oddStart = current;
					oddEnd = current;
				} else {
					oddEnd.next = current;
					oddEnd = oddEnd.next;
				}
			} else {
				if (evenStart == null) {
					evenStart = current;
					evenEnd = current;
				} else {
					evenEnd.next = current;
					evenEnd = evenEnd.next;
				}

			}
			current = current.next;
		}
		if (evenStart == null || oddStart == null) {
			return head;
		}
		evenEnd.next = oddStart;
		oddEnd.next = null;

		return evenStart;

	}

	private static Node segregateEvenOdd(Node head) {
		Node current =head;
		Node currentEven=null;
		boolean isFirstEven=true;
        LinkedHashSet<Node> set= new LinkedHashSet<>();
		while(current!=null){
			if(current.data%2!=0){
				set.add(current);
				if(currentEven!=null){
					currentEven.next=current.next;
				}
			}else{
				if(isFirstEven){
					head=current;
					isFirstEven=false;
				}
				currentEven=current;

			}
			current=current.next;
		}
		Node temp =currentEven;
		Iterator<Node> itr=set.iterator();
		while(itr.hasNext()){
			Node t= itr.next();
			temp.next=t;
			temp=t;
		}
		temp.next=null;
		return head;
	}

}
