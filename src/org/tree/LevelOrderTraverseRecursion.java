package org.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LevelOrderTraverseRecursion {

    //store nodes at each depth level
    static List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public static class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer val){
            this.val = val;
        }
    }

    public static void helper(TreeNode node, int level){
        System.out.println("node = " + node.val);
        System.out.println("level = " + level);
        System.out.println("------levels Size = " + levels.size());

        //start the current level
        if(levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }

        //fulfill the current level
        if(node.val != null){
            levels.get(level).add(node.val);
        }

        //process the child nodes at the next level
        if(node.left != null){
            helper(node.left, level+1);
        }

        if(node.right != null){
            helper(node.right, level+1);
        }

    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        if(root == null){
            return levels;
        }
        helper(root, 0);
        return levels;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3); //[3, 9, 20, null, null, 15, 7]

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.left.left = new TreeNode(null);
        root.left.right = new TreeNode(null);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(""+ Arrays.toString(result.toArray()));
        //result.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);

    }

}
