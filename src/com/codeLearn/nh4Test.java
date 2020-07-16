package com.codeLearn;

public class nh4Test {
    public static void main(String[] args) {
        String str1 = "121";
        String str2 = "1212";
        System.out.println(getThreeSum(str1,str2));

    }

    public static String getThreeSum(String str1, String str2) {
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        int len1 = s1.length;
        int len2 = s2.length;
        int[] num1 = new int[Math.max(len1, len2)];
        for (int i = s1.length - 1, j = 0; i >= 0; i--,j++) {
            num1[j] = Integer.parseInt(s1[i]);
        }
        int[] num2 = new int[Math.max(len1, len2)];
        for (int i = s2.length - 1, j = 0; i >= 0; i--,j++) {
            num2[j] = Integer.parseInt(s2[i]);
        }

        int jinwei = 0;
        int index = 0;
        int result =0;
        StringBuffer sb = new StringBuffer();
        while (index<Math.max(len1,len2)){
            result = (num1[index]+num2[index]+jinwei)%3;
            jinwei = (num1[index]+num2[index]+jinwei)/3;
            sb.insert(0,result+"");
            index++;
        }
        if (jinwei != 0){
            sb.insert(0,jinwei+"");
        }
        return sb.toString();


    }
}
