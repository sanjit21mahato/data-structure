package easy;

public class InsertAtEndOfSinglyLinkedList_4 {

	public static void main(String[] args) {
		
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        
        head= insertAtEndOfSinglylinkedList(40,head);
        
        LinkedListUtil.traverseHead(head);

	}

	private static Node insertAtEndOfSinglylinkedList(int data, Node head) {
		
		if(head==null){
			head= new Node(data);
		}else{
			Node currentNode = head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}
			Node endNode= new Node(data);
			currentNode.next=endNode;
		}
		return head;
	}

}
