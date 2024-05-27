package difficult;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import easy.Node;

public class BottomViewOfBinaryTree_18 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(50);
		root.left.left=new Node(30);
		root.left.right=new Node(40);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		
		printBottomViewOfBT(root);

	}

	private static void printBottomViewOfBT(Node root) {

      if(root==null)return ;
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(root,0));
      Map<Integer, Integer> map = new TreeMap<>();
      while(q.isEmpty()==false){
    	  Pair p = q.poll();
    	  Node currentNode = p.node;
    	  int hd = p.hd;
    	
    	  map.put(hd, currentNode.key);
    	  
    	  if(currentNode.left!=null){
    		 q.add(new Pair(currentNode.left, hd-1)) ;
    	  }
    	  if(currentNode.right!=null){
    		  q.add(new Pair(currentNode.right, hd+1)) ;
    	  }
      }
      
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
    	  System.out.println(entry.getValue());
      }
      
      
      
		
	}

}
