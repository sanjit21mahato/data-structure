package medium;

import easy.Node;

public class FindLengthOfLoopInLinkedList_31 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next =head.next.next;
		
		int length = findLengthOfLoop(head);
		//It is failing in some cases need to verify  
		//int length = findLengthOfLoopEfficient(head);
		System.out.println(length);

	}
	
	private static int findLengthOfLoopEfficient(Node head) {

	      int l=1;
	      if(head==null)return 0;
	       
	      if(head.next==head)return 1;
	       
	      Node slow=head;
	      Node fast=head;
	      while(fast!=null && fast.next!=null){
	    	  slow=slow.next;
	    	  fast=fast.next.next;
	    	  if(slow==fast){
	    		  return l;
	    	  }
	    	  l++;
	      }	   
		 return l;
		}


	private static int findLengthOfLoop(Node head) {
		int lengthOfLoop=0;
		Node slow=head;
		Node fast=head;
		if(head==null)return 0;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				break;
			}
		}
		
		if(slow!=fast)
		return 0;
		
		slow=head;
		while(slow.next!=fast.next){
			slow=slow.next;
			fast=fast.next;
		}
		int i=1;
		slow=fast.next;
		while(slow!=fast){
			slow=slow.next;
			i++;
		}
		return i;
	}
}
