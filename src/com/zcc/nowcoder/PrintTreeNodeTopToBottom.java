package com.zcc.nowcoder;

import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintTreeNodeTopToBottom {

    public ArrayList<Integer> printFromTopToBottom(TreeNode treeNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (treeNode == null) return arrayList;
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode temp =queue.remove(0);
            if (temp.left !=null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }
            arrayList.add(temp.val);
        }
        return arrayList;
    }


    class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
