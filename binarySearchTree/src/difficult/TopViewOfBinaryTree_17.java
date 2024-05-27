package difficult;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import easy.Node;

class Pair{
    Node node;
    int hd;
    Pair(Node n, int h)
    {
    	node=n;
    	hd=h;
    }
}

public class TopViewOfBinaryTree_17 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(50);
		root.left.left=new Node(30);
		root.left.right=new Node(40);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		printTopViewOfBT(root);

	}

	private static void printTopViewOfBT(Node root) {
		
		if(root==null)return;
		Queue<Pair>q= new LinkedList<Pair>();
		Map<Integer, Integer> map = new TreeMap<>();
		q.add(new Pair(root,0));
		while(q.isEmpty()==false){
			Pair p = q.poll();
			Node cn = p.node;
			int hd = p.hd;
			if(map.containsKey(hd)==false){
				map.put(hd, cn.key);
			}
			if(cn.left!=null){
				q.add(new Pair(cn.left,hd-1));
			}
			if(cn.right!=null){
				q.add(new Pair(cn.right, hd+1));
			}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			System.out.println(entry.getValue());
		}
	}

}
