package com.codeLearn;
//最长重复字符串长度
public class getLongStr {
    public static void main(String[] args) {
        String str = "dddsgshhhhhhhhssssssfhkkkkkkk";
        int longSubstr = getLongSubstr(str);
        System.out.println(longSubstr);

    }

    public static int getLongSubstr(String str){

        int max = 1;
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i+1,i+2).equals(str.substring(i,i+1))){
                count++;
                max = Math.max(count,max);
            }else {
                count=1;
            }
        }
        return max;
    }
}
