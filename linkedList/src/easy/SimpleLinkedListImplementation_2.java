package easy;

/*Data type of Linkedlist is decided by the type of the data we store in Node 
 *Actual implementation is with method insertAtBegin, insertAtEnd, 
 *InsertAtIndex and all other operations*/

public class SimpleLinkedListImplementation_2 {

	public static void main(String[] args) {
		
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        LinkedListUtil.traverseHead(head);

	}

}
