package com.zcc.nowcoder;


/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 子结构的判断标准（树B和树A从根节点开始比较，若每个节点树B和树A相等，且树B节点数少于等于树A，则说树B是树A的子结构）
 */
public class TreeAHasSubtreeB {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag =false;
        if (root1 !=null && root2!=null){
            if (root1.val ==root2.val){
                flag =isTreeAHasTreeB(root1,root2);
            }
            if (!flag){
                flag =HasSubtree(root1.left,root2);
            }
            if (!flag){
                flag =HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }


    public boolean isTreeAHasTreeB(TreeNode root1,TreeNode root2){
        if (root2 ==null){return true;}
        if (root1 ==null){return false;}
        if (root1.val != root2.val){return false;}
        return isTreeAHasTreeB(root1.left,root2.left)
                && isTreeAHasTreeB(root1.right,root2.right);
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
