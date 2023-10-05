package easy;

public class MaximumInBinaryTree_4 {

	public static void main(String[] args) {
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right= new Node(50);
		int max = findMaxInBTree(root);
		System.out.println(max);

	}

	private static int findMaxInBTree(Node root) {
		if(root==null){
			return 0;
		}
		else{
		    return Math.max(root.data, Math.max(findMaxInBTree(root.left), findMaxInBTree(root.right)));
		}
	}

}
