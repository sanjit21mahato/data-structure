package easy;

public class NthNodeFromEndOfLinkedList_24 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next= new Node(50);
		
		int res= findNthNodeFromEnd(head,2);
		System.out.println(res);
	}

	private static int findNthNodeFromEnd(Node head, int nodefromEnd) {
		if(head==null){
			return -1;
		}
		Node slow=head;
		int i=0;
		Node fast=head;
		while(i<nodefromEnd){
			fast=fast.next;
			i++;
		}
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		
		return slow.data;
	}

}
