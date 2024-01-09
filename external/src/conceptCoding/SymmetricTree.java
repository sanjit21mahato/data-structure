/**
Given the root of a binary tree, check whether it is a mirror of itself 
(i.e., symmetric around its center).
Example 1:
                 1
            2         2
         3     4    4     3
Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:
                  1
              2       2   
                3        3
Input: root = [1,2,2,null,3,null,3]
Output: false
 
Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 */
package conceptCoding;

/**
 * @author sanjit
 *
 */

public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

      TreeNode root = new TreeNode(1);
      root.left= new TreeNode(2);
      root.right= new TreeNode(2);
      root.left.left=new TreeNode(3);
      root.left.right= new TreeNode(4);
      root.right.left= new TreeNode(4);
      root.right.right= new TreeNode(3);
      boolean isSymmetric = isSymmetric(root);
      
      
      System.out.println(isSymmetric);

	}

	private static boolean isSymmetric(TreeNode root) {
		
		return isSymmetricCheck(root.left,root.right);
	}

	private static boolean isSymmetricCheck(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		//if((left==null && right!=null) || (left!=null && right==null)){
		if(left==null || right==null){
			return false;
		}
		if (left.value != right.value) {
			return false;
		} else {
			return isSymmetricCheck(left.right, right.left) && isSymmetricCheck(left.left, right.right);
		}
	}

	

}
