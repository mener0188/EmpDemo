package com.zz.binarytree;

public class BinaryTest {
	
	/**
	 *       1
	 *     2, 3
	 *   4,5  6,7
	 *    8,9
	 *       10
	 *   前序 DLK
	 *   
	 *   1	2	4	5	8	9	10	3	6	7   
	 *   
	 *   中序: LDK
	 *   4	2	8	5	9	10	1	6	3	7
	 *      
	 *      
	 */
	public static void main(String[] args) {
		BinaryTreeNode node10 = new BinaryTreeNode(10,null,null);
        BinaryTreeNode node8 = new BinaryTreeNode(8,null,null);
        BinaryTreeNode node9 = new BinaryTreeNode(9,null,node10);
        BinaryTreeNode node4 = new BinaryTreeNode(4,null,null);
        BinaryTreeNode node5 = new BinaryTreeNode(5,node8,node9);
        BinaryTreeNode node6 = new BinaryTreeNode(6,null,null);
        BinaryTreeNode node7 = new BinaryTreeNode(7,null,null);
        BinaryTreeNode node2 = new BinaryTreeNode(2,node4,node5);
        BinaryTreeNode node3 = new BinaryTreeNode(3,node6,node7);
        BinaryTreeNode node1 = new BinaryTreeNode(1,node2,node3);

        TraversalBinaryTree tree = new TraversalBinaryTree();

        //采用递归的方式进行遍历
//        System.out.println("-----前序遍历------");
//        System.out.print("递归:\t");
//        tree.preOrder(node1);
//        System.out.println();
//
//        //采用非递归的方式遍历
//        System.out.print("非递归:\t");
//        tree.preOrderNonRecursive(node1);
//        System.out.println();
//        
//        //采用递归的方式进行遍历
//        System.out.println("-----中序遍历------");
//        System.out.print("递归:\t");
//        tree.inOrder(node1);
//        System.out.println();
        
        
        //有序二叉树, 二分查找树
        BinaryTreeNode node100 = new BinaryTreeNode(100);
        BinaryTreeNode node50 = new BinaryTreeNode(50);
        BinaryTreeNode node150 = new BinaryTreeNode(150);
        BinaryTreeNode node87 = new BinaryTreeNode(87);
        BinaryTreeNode node98 = new BinaryTreeNode(98);
        
        BinaryTreeNode node80 = new BinaryTreeNode(80);
        
        
        
        tree.insertPreSeq(node100, node50);
        tree.insertPreSeq(node100, node150);
        
        tree.insertPreSeq(node100, node80);
        
        tree.insertPreSeq(node100, node87);
        tree.insertPreSeq(node100, node98);
        
        tree.preOrder(node100);
        System.out.println("------------------");
        tree.inOrder(node100);
        System.out.println("------------------");
        tree.postOrder(node100);
        
        
	}

}
