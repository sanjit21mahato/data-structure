package easy;

public class InsertAtGivenPoisitionInSinglyLinkedList_7 {

	public static void main(String[] args) {
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        
        head=insertAtGivenPosition(head,1, 15);
        LinkedListUtil.traverseHead(head);

	}

	private static Node insertAtGivenPosition(Node head, int p, int data) {
		
		Node currentNode = head;
		if (p == 0) {
			if (head == null) {
				head = new Node(data);
			} else {
				Node node = new Node(data);
				node.next = head;
				head = node;
			}
		} else {
			int i = 1;
			while (i < p) {
				currentNode = currentNode.next;
				i++;
			}
			Node newNode= new Node(data);
			newNode.next=currentNode.next;
			currentNode.next=newNode;
		}
		return head;
	}

}
