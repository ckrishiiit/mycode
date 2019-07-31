package com.krish.code;

import com.krish.code.MyBST.TreeNode;

public class BalancedBinaryTree {

	//a binary tree in which the depth of the two subtrees of every node 
	//never differ by more than 1.
	
	 class BalanceStatusWithHeight{
		
		public boolean isBalanced;
		public int height;
		
		public BalanceStatusWithHeight(boolean isBalanced, int height) {
			this.isBalanced = isBalanced;
			this.height = height;
		}
	}
	
	public BalanceStatusWithHeight checkBalanced(TreeNode root) {

		if (root == null)
			return new BalanceStatusWithHeight(true, -1);

		// go to left
		BalanceStatusWithHeight leftResult = checkBalanced(root.left);
		if (!leftResult.isBalanced)
			return leftResult;

		// go to right
		BalanceStatusWithHeight rightResult = checkBalanced(root.right);
		if (!rightResult.isBalanced)
			return rightResult;

		boolean subTreeBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
		int height = Math.max(leftResult.height, rightResult.height) + 1;
		return new BalanceStatusWithHeight(subTreeBalanced, height);

	}
	
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).isBalanced;
    
    }
}
