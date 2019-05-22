package com.zcc.nowcoder;


/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class ListNodeMerge {

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 ==null && list2 ==null) return null;
        if (list1 ==null && list2 !=null) return list2;
        if (list1 !=null && list2 ==null) return list1;
        ListNode merge =null;
        if (list1.val <list2.val){
            merge =list1;
            merge.next =Merge(list1.next,list2);
        }else {
            merge =list2;
            merge.next =Merge(list1,list2.next);
        }
        return merge;
    }


    class ListNode{
        int val;
        ListNode next =null;
        ListNode(int val){
            this.val =val;
        }
    }
}
