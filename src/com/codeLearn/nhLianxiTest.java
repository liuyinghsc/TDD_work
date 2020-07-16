package com.codeLearn;
//找str1在str2中第一次出现的位置，不用库函数
public class nhLianxiTest {
    public static void main(String[] args) {
        String str1 = "ww";
        String str2 = "dsdwwsvdww";
        int firstIndex = getFirstIndex(str1, str2);
        System.out.println(firstIndex);

    }

    public static int getFirstIndex(String str1,String str2){
        int len1 = str1.length();
        int index = -1;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.equals(str2.substring(i,i+len1))){
                index = i;
                break;
            }
        }
        return index;
    }


}
