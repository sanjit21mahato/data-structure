package easy;

import java.util.HashSet;
import java.util.Set;

/*
Solutions:
1. By maintaining extra flag isVisited in Node of LinkedList and make this flag true while
		traversing the list and if next of any node points there.  
2. By maintaining a temp variable and let all visited node points to this and check if
   next of any node point there. this destroys the structure of LinkedList
3. By using Hashing , chec and keep visited node in hashset 
   O(n)/O(n)
4. Floyd cycle detection (Using two pointers)
   O(n)/O(1) 

 */

public class DetectLoopInLinkedList_29 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next.next;
		
		 boolean isLoop =detectLoopUsingFlyodCycle(head);
		// boolean isLoop =detectLoopUsingHashing(head);
		System.out.println(isLoop);

	}

	private static boolean detectLoopUsingFlyodCycle(Node head) {
		
		if(head==null){
			return false;
		}
		Node slow =head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		
		return false;
	}

	private static boolean detectLoopUsingHashing(Node head) {
        if(head ==null){
        	return false;
        }
        Set<Node> set = new HashSet<>();
        Node current = head;
        while(current!=null){
        	if(set.contains(current)){
        		return true;
        	}else {
        		set.add(current);
        	}
        	current=current.next;
        }
		return false;
	}

}
