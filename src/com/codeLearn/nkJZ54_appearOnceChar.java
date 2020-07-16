package com.codeLearn;

import java.util.ArrayList;
import java.util.List;

public class nkJZ54_appearOnceChar {

    public static void main(String[] args) {
        nkJZ54_appearOnceChar nkJZ54 = new nkJZ54_appearOnceChar();
        nkJZ54.Insert('g');
        nkJZ54.Insert('o');
//        nkJZ54.Insert('o');
//        nkJZ54.Insert('g');
//        nkJZ54.Insert('l');
        char c = nkJZ54.FirstAppearingOnce();
        System.out.println(c);

    }

    //    请实现一个函数用来找出字符流中第一个只出现一次的字符。
//    例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
//    当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
//Insert one char from stringstream
    List<Character> list = new ArrayList<>();

    public void Insert(char ch) {
        list.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) == list.lastIndexOf(list.get(i))) {
                return list.get(i);
            }
        }
        return '#';
    }

    public int FirstAppearingOnce(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

}
