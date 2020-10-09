package com.zz.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 遍历二叉树
 */
public class TraversalBinaryTree {
	
//	public BinaryTreeNode root;
	

    /**
     * 采用递归的方式前序遍历
     */
    public void preOrder(BinaryTreeNode root){
        if (root != null){
            System.out.print(root.getData() + "\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    
    /**
     *      100
     *    50  150
     * 
     * 
     */
    public void insertPreSeq(BinaryTreeNode root, BinaryTreeNode node){
    	//node = 24
    	
    	if (root != null){
            if(node.getData()<root.getData()){
            	if(root.getLeft()!=null){
            		insertPreSeq(root.getLeft(), node);
            	}else{
            		root.setLeft(node);
            	}
            }
            
            //
            if(node.getData()>root.getData()){
            	if(root.getRight()!=null){
            		insertPreSeq(root.getRight(), node);
            	}else{
            		root.setRight(node);
            	}
            }
        }
    }

    /**
     * 采用非递归的方式前序遍历
     */
    public void preOrderNonRecursive(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        while (true){
            while (root != null){
                System.out.print(root.getData() + "\t");
                stack.push(root);
                root = root.getLeft();
            }
            if (stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.getRight();
        }
    }

    /**
     * 采用递归的方式中序遍历
     */
    public void inOrder(BinaryTreeNode root){
        if (root != null){
            inOrder(root.getLeft());
            System.out.print(root.getData() + "\t");
            inOrder(root.getRight());
        }
    }

    /**
     * 采用非递归的方式中序遍历
     */
    public void inOrderNonRecursive(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                root = root.getLeft();
            }
            if (stack.isEmpty()){
                break;
            }
            root = stack.pop();
            System.out.print(root.getData() + "\t");
            root = root.getRight();
        }
    }

    /**
     * 采用递归的方式后序遍历
     */
    public void postOrder(BinaryTreeNode root){
        if (root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + "\t");
        }
    }

    /**
     * 采用非递归的方式后序遍历
     */
    public void postOrderNonRecursive(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        while (true){
            if (root != null){
                stack.push(root);
                root = root.getLeft();
            }
            else{
                if (stack.isEmpty()){
                    return;
                }

                if (stack.lastElement().getRight() == null){
                    root = stack.pop();
                    System.out.print(root.getData() + "\t");
                    while (root == stack.lastElement().getRight()){
                        System.out.print(stack.lastElement().getData() + "\t");
                        root = stack.pop();
                        if (stack.isEmpty()){
                            break;
                        }
                    }
                }

                if (!stack.isEmpty()) {
                    root = stack.lastElement().getRight();
                }
                else{
                    root = null;
                }
            }
        }
    }

    /**
     * 层序遍历
     */
    public void levelOrder(BinaryTreeNode root){
        BinaryTreeNode temp;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.print(temp.getData() + "\t");
            if (temp.getLeft() != null){
                queue.offer(temp.getLeft());
            }

            if (temp.getRight() != null){
                queue.offer(temp.getRight());
            }
        }
    }

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
        System.out.println("-----前序遍历------");
        System.out.print("递归:\t");
        tree.preOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.preOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----中序遍历------");
        System.out.print("递归:\t");
        tree.inOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.inOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----后序遍历------");
        System.out.print("递归:\t");
        tree.postOrder(node1);
        System.out.println();

        //采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.postOrderNonRecursive(node1);
        System.out.println();

        //采用递归的方式进行遍历
        System.out.println("-----层序遍历------");
        System.out.print("递归:\t");
        tree.levelOrder(node1);
        System.out.println();
    }
}
