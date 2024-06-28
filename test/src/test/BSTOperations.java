package test;

import javax.naming.directory.SearchControls;

class Node{
	
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
}

public class BSTOperations {
	Node root =null;
	
	public BSTOperations() {
		root=null;
	}
	
	public static void main(String args[]) {
		
		BSTOperations bst = new BSTOperations();
		//insert
		bst.insert(20);
		bst.insert(30);
		bst.insert(10);
		bst.insert(15);
		bst.insert(25);
		bst.insert(40);
		bst.insert(35);
		
		//traverse
		bst.traverse(bst.root);
		
		//search
		boolean isPresent=bst.search(35);
		System.out.println(isPresent);
		
		//delete
		bst.delete(30);
		bst.traverse(bst.root);

	}

	private void delete(int data) {
		
		Node node = deleteRecord(root,data);
		
	}

	private Node deleteRecord(Node root, int data) {
		if(root==null){
			return null;
		}
		else {
			if(data<root.data){
				root.left= deleteRecord(root.left, data);
			}else if(data>root.data){
				root.right=deleteRecord(root.right, data);
			}else {
				if(root.right==null){
					return root.left;
				}else if(root.left==null){
					return root.right;
				}else {
					
					Node succsessor = findSuccessor(root);
					root.data=succsessor.data;
					root.right =deleteRecord(root.right, succsessor.data);
				}
				
			}
		}
		
		return root;
	}

	private Node findSuccessor(Node node) {
       Node currentSuccessor = node.right;
        while(currentSuccessor!=null && currentSuccessor.left!=null){
        	currentSuccessor= currentSuccessor.left;
        }
		return currentSuccessor;
	}

	private boolean search(int data) {
		
		return searchRecord(root,data);
	}

	private boolean searchRecord(Node root, int data) {
		if(root==null){
			return false;
		}else if(data==root.data){
			return true;
		}else if(data<root.data){
			return searchRecord(root.left, data);
		}else {
		    return searchRecord(root.right, data);
		}
	}

	private void traverse(Node root) {

       if(root!=null){
    	   traverse(root.left);
    	   System.out.println(root.data);
    	   traverse(root.right);
       }
	}

	private void insert(int data) {
		
		root= insertRecord(root, data);
	}

	private Node insertRecord(Node root, int data) {
		if(root==null){
			root = new Node(data);
			return root;
		}
		else {
			if(data<root.data){
			 root.left= insertRecord(root.left, data);
			}
		    else if(data>root.data){
			root.right = insertRecord(root.right, data);		
		    }
		}
		return root;
	}

	
}
