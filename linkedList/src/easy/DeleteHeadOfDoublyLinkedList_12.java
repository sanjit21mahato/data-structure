/**
 * 
 */
package easy;

/**
 * @author sanji
 *
 */
public class DeleteHeadOfDoublyLinkedList_12 {

	/**
	 * @param args
	 */
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
		    
		    head=deleteHeadOfDoublyLinkedList(head);
		    System.out.println(head.data);

	}

	private static Node deleteHeadOfDoublyLinkedList(Node head) {
		if(head==null || head.next==null){
			return null;
		}
		else {
			head =head.next;
			head.previous=null;
		}
		return head;
	}

}
