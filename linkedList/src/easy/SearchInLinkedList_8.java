package easy;

public class SearchInLinkedList_8 {

	public static void main(String[] args) {
		Node head = new Node(10);
    	Node n2 = new Node(20);
    	head.next = n2;
    	Node n3 = new Node(30);
        n2.next= n3;
        n3.next=null; 
        
        int index= searchInLinkedList(head,10);
        if(index==-1){
        	System.out.println("The searched data is not in Linked List");
        }else{
        System.out.println(index);
        }

	}

	private static int searchInLinkedList(Node head, int data) {
		Node currentNode = head;
		int i = 0;
		while (currentNode != null) {
			if (data == currentNode.data) {
				return i;
			} else {
				currentNode=currentNode.next;
				i++;
			}
		}
		return -1;
	}

}
