/**
 * 
 */
package easy;

/**
 * @author sanji
 *
 */
public class InsertAtBeginOfSinglyLinkedlist_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        head= insertAtBeginning(head,5);
        LinkedListUtil.traverseHead(head);
        
        

	}

	private static Node insertAtBeginning(Node head,int data) {
		if(head==null){
			head= new Node(5);
		}else{
			Node node= new Node(5);
			node.next=head;
			head=node;
			
		/*	Node temp=head;
			head= new Node(data);
			head.next=temp;*/
		}
		return head;
	}

}
