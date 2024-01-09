/*
Red Black Tree is also Self Balanced BST
We do the restructuring in case of insert and delete.

Every node is either Red or Black
Root is always black
No two consecutive reds i.e cannot have red node child as red
Number of black nodes from every node to all of descendant leaves should be same.

In Red Black Tree the we can have at most twice the number of nodes 
to its farthest leave in one path as compared to number of nodes to its closet leave
in other path 

In AVL we were allowed to have difference of 1 between two heights
In RBT we are allowed to have difference twice

Red Black Tree is less strict in Balancing than AVL

when you have too many searches and fewer insert and delete 
then AVL tree is preferred since AVL tree has faster search.

When we have mix of search, insert and delete 
Red Black Tree is preferred.

TreeMap and Treeset is implements RBT 
 */
package difficult;

/**
 * @author sanjit
 *
 */
public class RedBlackTree_8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
