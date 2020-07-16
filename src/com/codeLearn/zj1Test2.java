package com.codeLearn;

import java.util.ArrayList;
import java.util.List;

public class zj1Test2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        List<Integer> s = new ArrayList<>();
        while (head != null) {
            s.add(head.value);
            head = head.next;
        }
        gets(s);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.size(); i++) {
            if (i != s.size() - 1) {
                sb.append(s.get(i) + "->");
            } else {
                sb.append(s.get(i));
            }

        }
        System.out.println(sb.toString());
    }

    static class ListNode {
        ListNode head;
        ListNode next;
        int value;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static void gets(List<Integer> s) {
        int temp = 0;
        for (int i = 0; i < s.size() - 1; i = i + 2) {
            temp = s.get(i);
            s.set(i, s.get(i + 1));
            s.set(i + 1, temp);
        }
    }
}
