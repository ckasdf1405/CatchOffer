package com.zcc.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

public class ListFromTailToHead {

    ArrayList<Integer> arrayList = new ArrayList<>();
    //递归实现反向
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode != null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    //利用栈的后进先出特性，用pop()方法实现反向
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode =listNode.next;
        }
        while (!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }


    class ListNode{
        int val ; //属性1，值
        ListNode next =null; //属性2，下个节点
        ListNode(int val){
            this.val=val;
        }
    }
}
