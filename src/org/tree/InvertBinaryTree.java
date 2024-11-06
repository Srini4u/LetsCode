package org.tree;

import java.util.Arrays;

public class InvertBinaryTree {

    public static void main(String[] args){
        int[] binaryTree = new int[]{4,2,7,1,3,6,9}; //4,7,2,3,1,9,6
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(9);

        System.out.println("Input:");
        printTree(node);
        TreeNode resultNode = invertTree(node);
        System.out.println("Output:");
        printTree(resultNode);

    }

    public static TreeNode invertTree(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode right = invertTree(node.right);
        TreeNode left = invertTree(node.left);
        node.left = right;
        node.right = left;
        return node;
    }

    public static void printTree(TreeNode node){
        if(node == null){return;}
        printTree(node.left);
        System.out.println(node.val+" ");
        printTree(node.right);
    }


}
