package org.tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class LevelOrderTraversal {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Level-order traversal of the binary tree:");
        levelOrderSimple(root);

    }

    public static void levelOrderSimple(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //queue.stream().map(treeNode -> treeNode.val).forEach(System.out::println);

       while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.println(" " + current.val+" ");

            if(current.left != null){
                queue.add(current.left);
            }

            if(current.right != null){
                queue.add(current.right);
            }

       }
    }

}
