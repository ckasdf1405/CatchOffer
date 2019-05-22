package com.zcc.nowcoder;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) return head;
        ListNode node =head;
        int count =0;
        while (node != null) {
            count++;
            node =node.next;
        }
        if (count <k) return null;
        ListNode list =head;
        for (int i =0;i<count-k;i++){
            list =list.next;
        }
        return list;
    }


    class ListNode{
        int val;
        ListNode next =null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
