package com.krish.code;

import com.krish.code.MyBST.TreeNode;

public class InOrderSuccessorBST {

	
	 private TreeNode findNode(TreeNode root, TreeNode p) {
		 if(root == null || root.val == p.val)
			 return root;
		 
		 if(p.val > root.val)
			 return findNode(root.right, p);
		 
		 return findNode(root.left, p);
	 }
	 
	private TreeNode findMin(TreeNode root) {

		TreeNode curr = root;
		while (curr != null && curr.left != null)
			curr = curr.left;

		return curr;
	}
	 
	  public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	       
		  TreeNode node = findNode(root, p);
		  if(node == null)
			  return null;
		  
		  //case 1 -- Node has right sub tree
		  if(node.right != null)
			  return findMin(root.right);
		  //case 2 -- Node does not have right subtree
		  else {
			  TreeNode successor = null;
			  TreeNode ancestor = root;
			  while(ancestor != node) {
				  if(node.val < ancestor.val) {
					  successor = ancestor;
					  ancestor =  ancestor.left;
				  }
				  else
					  ancestor = ancestor.right;
			  }
			  return successor;
		  }
	   }
}
