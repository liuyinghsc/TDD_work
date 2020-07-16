package com.codeLearn;

public class CicleList {

    private ListNode head = null;

    public void init() {
        head = new ListNode();
        head.next = head;
    }

    public void insertCicleList(int data) {
        ListNode newNode = new ListNode(data);
        if (head.next == head) {
            head.next = newNode;
            newNode.next = head;
        } else {
            ListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteCicleList(int data) {
        ListNode temp = head;
        if (temp.next.data == data) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }

    }

}




