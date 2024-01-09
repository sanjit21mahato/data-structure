/**
 * Ceiling in BST for a given key is the closet larger value to key
 * i.e. near by largest value of the key
 *
 * */

package medium;

/**
 * @author sanjit
 *
 */
public class CeilInBST_5 {

	static Node res =null;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right = new Node(30);

		Node ceiling = findCeilInBST(root, 4);
		if(ceiling!=null)
 		System.out.println(ceiling.key);
 		else {
 			System.out.println(ceiling);
 		}

	}

	private static Node findCeilInBST(Node root, int key) {

        while(root!=null){
        	if(root.key ==key) {
        		return root;
        	}
        	else if(key>root.key) {
        		root = root.right;
        	}
        	else if(key<root.key){
        		res = root;
        		root=root.left;
        	}	
        }
        return res;
	}
}
