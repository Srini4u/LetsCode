package org.tree;

import java.util.*;

public class LevelOrderTraverseQueue {

    public static List<List<Integer>> orderLevel(TreeNode root){
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null){
            return levels;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;

        while(!queue.isEmpty()){

            //start the current level
            levels.add(new ArrayList<Integer>());

            //number of elements in the current level
            int levelLength = queue.size();
            for(int i =0; i < levelLength; ++i){
                TreeNode node = queue.remove();

                //fulfill current level
                if(node.val != null) {
                    levels.get(level).add(node.val);
                }

                //add child nodes in left and right
                if(node.left != null){queue.add(node.left);}
                if(node.right != null){queue.add(node.right);}
            }
            level++;

        }


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

        List<List<Integer>> result = orderLevel(root);
        System.out.println(""+ Arrays.toString(result.toArray()));

    }

}
