package easy;

public class DeleteFirstNodeOfSinglyLinkedlist_5 {

	public static void main(String[] args) {
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        
        head = deleteFirstNodeOfSinglyLinkedlist(head);
        LinkedListUtil.traverseHead(head);

	}

	private static Node deleteFirstNodeOfSinglyLinkedlist(Node head) {
		if(head!=null){
			Node temp=head;
			head=head.next;
			temp.next=null;
			
		}
		return head;
	}

}
