package com.codeLearn;

//将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
public class nkJZ49_reverseStrToInt {
    public static void main(String[] args) {
        String str = "+++";
        System.out.println(StrToInt(str));
    }

    public static int StrToInt(String str) {
        if (str.length() == 0 || str == null || str.trim() == ""||(str.length()==1&&(str.charAt(0)=='-'||str.charAt(0)=='+'))) {
            return 0;
        }
        int a = 0;
        String res = null;
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && (str.charAt(0) != '+' && str.charAt(0) != '-') && (str.charAt(0) < 48 || str.charAt(0) > 57)) {
                return 0;
            }
            if (str.charAt(0) == '-') {
                res = str.substring(1, str.length());
                if (check(res)) {
                    a = -Integer.parseInt(res);
                } else {
                    a = 0;
                }
                break;
            } else if (str.charAt(0) == '+') {
                res = str.substring(1, str.length());
                if (check(res)) {
                    a = Integer.parseInt(res);
                }else {
                    a = 0;
                }
                break;
            } else {
                if (check(str)) {
                    a = Integer.parseInt(str);
                }else {
                    a = 0;
                }
                break;
            }
        }
        return a;
    }

    public static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' || str.charAt(i) == '+' || str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }
}
