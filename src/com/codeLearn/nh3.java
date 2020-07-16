package com.codeLearn;

import java.util.ArrayList;
import java.util.Stack;

public class nh3 {
    public static void main(String[] args) {
        String str = "10-23+5+1-1";
//        System.out.println(yunsuan(str));
        System.out.println(sumyunsuan(str));

    }

    public static int yunsuan(String str) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int sum = 0;
        String s1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                stack2.push(str.charAt(i));
            }
            if (str.charAt(i) != '+' && str.charAt(i) != '-') {
                s1 += str.charAt(i);
                if (i == str.length() - 1 || str.charAt(i + 1) == '-' || str.charAt(i + 1) == '+') {
                    stack1.push(Integer.parseInt(s1));
                    s1 = "";
                }
            }
        }
        sum = stack1.pop();
        int qian = 0;
        while (stack1.size() != 0 && stack2.size() != 0) {
            qian = stack1.pop();
            Character fuhao = stack2.pop();
            if (fuhao.equals('-') && stack2.size() != 0 && fuhao.equals('-') && stack2.peek() == '-') {
                sum = sum + qian;
            } else if (fuhao.equals('-') && stack2.size() != 0 && fuhao.equals('-') && stack2.peek() == '+') {
                sum = qian - sum;
            } else if (fuhao.equals('+') && stack2.size() != 0 && fuhao.equals('+') && stack2.peek() == '-') {
                sum = qian - sum;
            } else if (fuhao.equals('-')) {
                sum = qian - sum;
            } else {
                sum += qian;
            }
        }
        return sum;
    }


    public static int sumyunsuan(String str){
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+' && str.charAt(i) != '-'){
                sb.append(str.charAt(i));
            }else {
                ch.add(str.charAt(i));
                num.add(Integer.parseInt(sb.toString()));
                sb.setLength(0);
            }
        }
        num.add(Integer.parseInt(sb.toString()));
        int sum = num.get(0);
        for (int i = 0; i < ch.size(); i++) {
            int num1 = num.get(i+1);
            if (ch.get(i) =='+'){
                sum += num1;
            }else if (ch.get(i) =='-'){
                sum -= num1;
            }
        }
        return sum;
    }

}
