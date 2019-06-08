package com.zcc.nowcoder;

/**
 * 输入某二叉树前序遍历和中序遍历的结果，重建并返回二叉树
 * 前序遍历顺序---根-左-右
 * 中序遍历顺序---左-根-右
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root =null;
        root =reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);//以in中in[i]=pre[0]的值为分界，in[i]左侧为左子树，右侧为右子树
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if (startPre>endPre || startIn>endIn) return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i=startIn;i<=endIn;i++) {
            if (pre[startPre] == in[i]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }



    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
    }
}



