package com.zz.binarytree;

/**
 * ����������
 */
public class BinaryTreeNode {
	
	private int data;  //����ֵ
    private BinaryTreeNode left;  //���ӽ��
    private BinaryTreeNode right;  //���ӽ��

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
