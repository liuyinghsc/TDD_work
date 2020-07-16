package com.codeLearn;
//找字符串中第一个出现的不重复的字符
public class firstUniuqeStr1nStr2 {
    public static void main(String[] args) {
        String str = "slfdlsd";
        int stStr = get1stStr(str);
        System.out.println(stStr);
    }

    public static int get1stStr(String str){
        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(i, i + 1);
            int start = str.indexOf(substring.charAt(0));
            int end = str.lastIndexOf(substring.charAt(0));
            if (start==end){
                return i;
            }
        }
        return -1;
    }

//    str1在str2的次数
    public static int getCount(String str1 ,String str2){
        int count =0 ;
        int i = 0;
        while (i<= (str2.length()-str1.length())) {
            if (str1.equals(str2.substring(i,i+str1.length()))){
                count++;
                i +=str1.length();
            }else {
                i++;
            }
        }
        return count;
    }
}
