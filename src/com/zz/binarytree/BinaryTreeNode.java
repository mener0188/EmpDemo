package com.zz.binarytree;

/**
 * 构建二叉树
 */
public class BinaryTreeNode {
	
	private int data;  //结点的值
    private BinaryTreeNode left;  //左子结点
    private BinaryTreeNode right;  //右子结点

    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        super();
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public BinaryTreeNode(int data) {
    	super();
    	this.data = data;
    }

    public int getData() {
        return data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
    
    
    

}
