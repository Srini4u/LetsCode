package org.tree;

import javax.swing.tree.TreeCellRenderer;

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer value){
        this.val = value;
    }
    public TreeNode(Integer value, TreeNode left, TreeNode right){
        this.val = value;
        this.left = left;
        this.right = right;
    }
}
