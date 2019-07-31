package com.krish.code;

import com.krish.code.MyBST.TreeNode;

public class LowestCommonAncestorBST {

	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
		 TreeNode node = root;
		 
		 int pVal = p.val, qVal = q.val;
		 
		 while( node!= null) {
			 
			 if(pVal > root.val && qVal > root.val)
				 node = node.right;
			 else if(pVal < root.val && qVal < root.val)
				 node = node.left;
			 
			 else return node;
		 }
		 
		 return null;
	 }
}
