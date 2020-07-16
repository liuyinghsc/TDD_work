package com.codeLearn;

public class zj2Test {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 1, 5, 3};
        int once = getOnce(num);
        System.out.println(once);

    }

    //异或 位运算
    public static int getOnce(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp ^= arr[i];
        }
        return temp;
    }
}
