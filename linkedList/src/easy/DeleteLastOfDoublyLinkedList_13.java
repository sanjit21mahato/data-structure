package easy;

public class DeleteLastOfDoublyLinkedList_13 {

	public static void main(String[] args) {
		 Node head=new Node(10);
		    head.previous=null;
		    Node n2= new Node(20);
		    head.next=n2;
		    n2.previous=head;
		    Node n3= new Node(30);
		    n2.next=n3;
		    n3.previous=n2;
		    n3.next=null;
		    
		    head=deleteLastOfDoublyLinkedList(head);
		    LinkedListUtil.traverseHead(head);
	}

	private static Node deleteLastOfDoublyLinkedList(Node head) {
		
		if(head==null ||head.next==null){
			return null;
		}
		Node currentNode= head;
		while(currentNode.next.next!=null){
			currentNode= currentNode.next;
		}
		currentNode.next=null;
		return head;
		
		
	}
}
