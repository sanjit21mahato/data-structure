package easy;

public class Test {
	static Node previous;
	static Node first;
	static Node second;

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(60);
		root.right = new Node(80);
		root.left.left = new Node(4);
		root.left.right = new Node(10);
		root.right.left = new Node(8);
		root.right.right = new Node(100);
		
		fixBSTWithTwoNodesSwapped(root);
		
		System.out.println("First: "+first.key);
		System.out.println("Second: "+second.key);

	}

	private static void fixBSTWithTwoNodesSwapped(Node root) {
        if(root==null){
        	return ;
        }
		fixBSTWithTwoNodesSwapped(root.left);
		
		if(previous!=null && root.key<previous.key){
			if(first==null){
				first=previous;
			}
			second=root;
		}
		previous=root;
		fixBSTWithTwoNodesSwapped(root.right);
		
		
	}

	

}
