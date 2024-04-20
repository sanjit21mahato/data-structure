package easy;

public class LinkedListUtil {
	
	public static void traverseHead(Node currentNode){
		
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode= currentNode.next;
		}
		
	}

	public static void main(String[] args) {



	}

}
