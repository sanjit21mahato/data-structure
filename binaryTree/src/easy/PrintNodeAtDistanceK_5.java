package easy;

public class PrintNodeAtDistanceK_5 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		
		int k=2;
		printNodeAtDistanceK(root,k);

	}

	private static void printNodeAtDistanceK(Node root, int k) {

		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
		} else {
			printNodeAtDistanceK(root.left, k - 1);
			printNodeAtDistanceK(root.right, k - 1);
		}

	}

}
