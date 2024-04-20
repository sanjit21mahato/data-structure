package easy;

public class InsertAtBeginOfDoublyLinkedList_10 {

	public static void main(String[] args) {

        Node head=null;
		head=insertAtBeginOfDoublyLinkedList(head,30);
		head=insertAtBeginOfDoublyLinkedList(head,20);
		head=insertAtBeginOfDoublyLinkedList(head,10);
		System.out.println(head.data);
		

	}

	private static Node insertAtBeginOfDoublyLinkedList(Node head, int data) {
	
		if(head==null){
			head= new Node(data);
		}
		else{
			Node temp= new Node(data);
			temp.next=head;
			head.previous=temp;
			head=temp;
		}
		return head;
		
		/*Node temp = new Node(data);
		 temp.next=head;
         if(head!=null){
       	   head.previous=temp;
         }
		 return temp;*/
	}

}
