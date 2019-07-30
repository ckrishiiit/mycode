package com.krish.code;

public class MyBST {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val) {
			this.val = val;
		}
	}
	
	private TreeNode findSucc(TreeNode root) {
		TreeNode curr = root;
		while(curr != null && curr.left != null)
			curr = curr.left;
		return curr;
	}
	
	public TreeNode searchBST(TreeNode root, int target) {
		
		if(root == null || root.val == target)
			return root;
		
		else if(target > root.val)
		 return	searchBST(root.right, target);
		
		return searchBST(root.left,target);
	}
	
	
	public TreeNode insertBST(TreeNode root, int val) {
		if(root == null)
			return new TreeNode(val);
		
		if(val > root.val)
			root.right = insertBST(root.right, val);
		else
			root.left = insertBST(root.left, val);
		
		return root;
	}
	
	public TreeNode deleteBST(TreeNode root, int val) {
		
		if(root == null)
			return null;
		
		if(root.val < val)
			root.left = deleteBST(root.left, val);
		else if(root.val > val)
			root.right = deleteBST(root.right, val);
		
		if(root.val == val) {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			else {
				TreeNode succ = findSucc(root.right);
				root.val = succ.val;
				root.right = deleteBST(root.right, val);
			}
		}
		return root;
	}
	
}
