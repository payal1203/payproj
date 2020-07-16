package binarytrees;

public class BinarySearchTree {
   private BinaryTreeNode<Integer> root;
   
   
    public BinarySearchTree() {
    	root=null;
    }
    
    public boolean search(int data) {
    	return search(root,data);
    }
    private boolean search(BinaryTreeNode<Integer> root,int data) {
    	if(root==null) {
    		return false;
    	}
    	if(data>root.data) {
    		return search(root.right,data);
    	}
    	else if(data<root.data) {
    		return search(root.left,data);
    	}
    	else {
    		return true;
    	}
    }
    
    public void insertData(int data) {
    	this.root=insertData(root,data);
    }
    private BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root,int data){
        if(root==null) {
    			BinaryTreeNode<Integer> newnode=new BinaryTreeNode<Integer>(data);
    			
    			return newnode;}
    	if(data<root.data) {
    		root.left=insertData(root.left,data);
    		return root;
    	}
    	else if(data>root.data) {
    		root.right=insertData(root.right, data);
    		return root;
    	}
    	else {
    		return root;
    	}
    	
    }
    public void deleteData(int data) {
    	this.root=deleteData(root, data);
    }
    private BinaryTreeNode<Integer> deleteData(BinaryTreeNode<Integer> root,int data){
    	if(data<root.data) {
    		root.left=deleteData(root.left,data);
    		return root;
    	}
    	else if(data>root.data) {
    		root.right=deleteData(root.right, data);
    		return root;
    	}
    	else {
    		if(root.left==null && root.right==null) {
    			return null;
    		}
    		else if(root.left==null) {
    			
    			return root.right;
    			
    		}
    		else if(root.right==null) {
    			root.data=root.left.data;
    			return root;
    		}
    		else {
    			int sdata=findsuccessor(root);
    			root.data=sdata;
    			root.right=deleteData(root.right, sdata);
    			return root;
    		}
    	}
    }
    private int findsuccessor(BinaryTreeNode<Integer> root){
    	BinaryTreeNode<Integer> temp=root.right;
    	while(temp.left!=null) {
    		temp=temp.left;
    	}
    	return temp.data;
    }
    public void printTree() {
    	printTree(root);
    }
    private void printTree(BinaryTreeNode<Integer> root) {
     String tobeprinted=root.data+":";
     if(root.left!=null) {
    	 tobeprinted=tobeprinted+"L:"+root.left.data+",";
     }
    if(root.right!=null) {
    	tobeprinted=tobeprinted+"R:"+root.right.data;
    }
    	System.out.println(tobeprinted);
    	printTree(root.left);
    	printTree(root.right);
    	
    	
    }
}

