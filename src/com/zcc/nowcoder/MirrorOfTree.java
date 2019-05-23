package com.zcc.nowcoder;

import java.awt.event.AdjustmentEvent;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 当节点不为空时，循环调用方法
 */
public class MirrorOfTree {
    public void getMirrorOfTree(TreeNode node){
        TreeNode temp;
        if (node !=null){
            temp =node.left;
            node.left =node.right;
            node.right =temp;
            if (node.left !=null) getMirrorOfTree(node.left);
            if (node.right !=null) getMirrorOfTree(node.right);
        }
    }



    class TreeNode{
        int val;
        TreeNode left =null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
