package com.zcc.nowcoder;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySequenceOfBST {
    /**
     * 后序遍历的最后一个值为root，先找到root
     * 二叉搜索树的左子树都比root小，右子树都比root大，所以序列中第一个比root大的数是右子树和左子树的分界
     * 再分别判断左子树中是否存在比root大的数或者右子树中是否存在比root小的数
     * 递归调用
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length ==0) return false;
        return isBST(sequence,0,sequence.length-1);
    }

    public boolean isBST(int [] sequence,int start,int end){
        if (end <=start) return true;
        int i =start;
        for (;i<end;i++){
            if (sequence[i]>sequence[end]) break;
        }
        for (int j=i;j<end;j++){
            if (sequence[j]<sequence[end]) return false;
        }
        return isBST(sequence,start,i-1) && isBST(sequence,i,end-1);
    }
}
