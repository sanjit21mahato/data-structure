package easy;

public class DeleteLastNodeOfSinglyLinkedList_6 {

	public static void main(String args[]){
		
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        
        deleteLastNodeOfSinglyLinkedList(head);
        
        LinkedListUtil.traverseHead(head);
	}

	private static void deleteLastNodeOfSinglyLinkedList(Node head) {
		if(head==null){
			return;
		}
		if(head.next==null){
			head =null;
		}
		Node currentNode = head;
		while(currentNode.next.next!=null){
			currentNode = currentNode.next;
		}
		currentNode.next=null;
	}
	
}
