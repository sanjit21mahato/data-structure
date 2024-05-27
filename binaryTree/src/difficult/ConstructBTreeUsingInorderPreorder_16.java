/*we can construct a BTree only when Inorder and preorder is given 
 * or inorder and postorder is given
So to contruct a B Tree inorder is required along with other traversal

*/
package difficult;

import easy.Node;
import easy.TreeTraversal_1;

/**
 * @author sanjit
 *
 */
public class ConstructBTreeUsingInorderPreorder_16 {

	public static void main(String[] args) {
		 int io[]={40,20,50,10,30};
		 int pr[]={10,20,40,50,30};
		 
		Node root= constructBtree(io, pr, 0, io.length-1);
		
		TreeTraversal_1 t= new TreeTraversal_1();
		t.inOrderTraversal(root);
		 

	}

	static int preIndex=0;
    public static Node constructBtree(int in[],int pre[],int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);
        
        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.data){
                inIndex=i;
                break;
            }
        }
        root.left=constructBtree(in, pre, is, inIndex-1);
        root.right=constructBtree(in, pre, inIndex+1, ie);
        return root;
    }

	private static int findIndex(int data, int[] io) {
       
       for(int i=0;i<io.length;i++){
    	   if(io[i]==data){
    		   return i;
    	   }
       }
       return -1;
	}

}
