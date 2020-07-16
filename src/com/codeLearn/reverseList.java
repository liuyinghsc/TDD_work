package com.codeLearn;

public class reverseList {

    public static void main(String[] args) {
        zj1Test2.ListNode head = new zj1Test2.ListNode(1);
        head.next = new zj1Test2.ListNode(2);
        head.next.next = new zj1Test2.ListNode(3);
        head.next.next.next = new zj1Test2.ListNode(4);
        zj1Test2.ListNode listNode = reverseListNode(head);
        System.out.println(listNode.value);

    }

    public static zj1Test2.ListNode reverseListNode(zj1Test2.ListNode listNode){
        zj1Test2.ListNode pre =null;
        zj1Test2.ListNode head = listNode;
        zj1Test2.ListNode next = listNode.next;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
