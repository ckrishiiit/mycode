package com.krish.code;

import com.krish.code.MyBST.TreeNode;

public class TestBST {

	public static void main(String a[]) {
		MyBST bst = new MyBST();
		
		TreeNode root = bst.insertBST(null, 15);
		bst.insertBST(root, 10);
		bst.insertBST(root, 8);
		bst.insertBST(root, 12);
		bst.insertBST(root, 6);
		bst.insertBST(root, 11);
		
        MyBST myBst = new MyBST();
       TreeNode node =  myBst.searchBST(root, 6);
        
		
		InOrderSuccessorBST in = new InOrderSuccessorBST();
		System.out.println(in.inorderSuccessor(root, node).val);
	}
}
