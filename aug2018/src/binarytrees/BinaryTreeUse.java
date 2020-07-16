package binarytrees;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root,int k){
    	if(root==null) {
    		return null;
    	}
    	if(root.data==k) {
    		return root;
    	}
    	else if(k<root.data) {
    		BinaryTreeNode<Integer> leftresult =searchInBST(root.left, k);
    		return leftresult;
    		
    	}
    	else {
    		BinaryTreeNode<Integer> rightresult=searchInBST(root.right,k);
    		return rightresult;
    	}
    }
    public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2) {
    	if(k1>root.data) {
    		//rightsubtree inorder
    		printNodeFromK1ToK2(root.right, k1, k2);
    	}
    	else if(k2<root.data){
    		//leftsubtree inorder
    		printNodeFromK1ToK2(root.left, k1, k2);
    	}
    	else {
    		//leftsub tree inorder 
    		//root
    		//rightsub tree inorder
    		printNodeFromK1ToK2(root.left, k1,k2);
    		System.out.println(root.data);
    		printNodeFromK1ToK2(root.right,k1 , k2);
    	}
    }
    public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
    	LinkedListNode<Integer> rootnode=new LinkedListNode<Integer>(root.data);
    	LinkedListNode<Integer> head=rootnode;
    	if(root.left!=null) {
    		LinkedListNode<Integer> lefthead=BSTToSortedLL(root.left);
    		head=lefthead;
    		while(lefthead.next!=null) {
    			lefthead=lefthead.next;
    		}
    		lefthead.next=rootnode;
    	}
    	LinkedListNode<Integer> righthead=BSTToSortedLL(root.right);
    	rootnode.next=righthead;
    	return head;  
    }
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
    	if(root==null) {
    		return null;
    	}
    	if(data==root.data) {
    		ArrayList<Integer> list=new ArrayList<>();
    		list.add(root.data);
    		return list;
    	}
    	else if(data<root.data) {
    		ArrayList<Integer> list=findPath(root.left, data);
    		if(list!=null) {
    			list.add(root.data);
    		}
    		return list;
    	}
    	else {
    		ArrayList<Integer> list=findPath(root.right, data);
    		if(list!=null) {
    			list.add(root.data);
    		}
    		return list;
    	}
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int left,int right){
    	if(left>right) {
    		return null;
    	}
    	int mid=(left+right)/2;
    	BinaryTreeNode<Integer> rootnode=new BinaryTreeNode<Integer>(arr[mid]);
    	rootnode.left=SortedArrayToBST(arr, left, mid-1);
    	rootnode.right=SortedArrayToBST(arr, mid+1, right);
    	return rootnode;
    	
    }
    public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max) {
    	if(root==null) {
    		return true;
    	}
    	if(root.data<min || root.data>max) {
    		return false;
    	}
    	
    	else {
    		
    		boolean leftresult,rightresult;
    		
    		leftresult=isBST(root.left, min, root.data-1);
    		
    		rightresult=isBST(root.right, root.data, max);
    		if(leftresult==true && rightresult==true) {
        		return true;
        	}
    		else {
    			return false;
    		}
    		
    		
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
