package lec_Generictrees;

public class TreeUse {
	public static int sumOfAllNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum=root.data;
		for(TreeNode<Integer> child:root.children) {
			sum+=sumOfAllNode(child);
		}
		return sum;
	}
	public static int countNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		for (TreeNode<Integer> child:root.children) {
			count+=countNodes(child);
		}
		return count+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeNode<Integer> node1=new TreeNode<Integer>(10);
    TreeNode<Integer> node2=new TreeNode<Integer>(20);
    TreeNode<Integer> node3=new TreeNode<Integer>(30);
    TreeNode<Integer> node4=new TreeNode<Integer>(40);
    node1.children.add(node2);
    node1.children.add(node3);
    node1.children.add(node4);
    for(TreeNode<Integer> node:node1.children) {
    	System.out.println(node);
    }
   
    
	}

}
