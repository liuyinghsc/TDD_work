package com.codeLearn;

import java.util.Arrays;
import java.util.HashMap;

public class getNearThree {

    public static void main(String[] args) {
        int[] arr = {33, 44, 61, 2, 36,42,56,81,11,17};
        int[] test = test(arr);
        for (Integer i : test) {
            System.out.println(i);
        }
    }

    public static int[] test(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        int[] cha = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cha[i] = arr[i] -avg;
        }
        int[] res = new int[3];
        res[0] = cha[0];
        res[1] = cha[1];
        res[2] = cha[2];
        for (int j = 3;j<cha.length;j++){
            int[] maxshuju = getMax(res);
            if (Math.abs(cha[j])<maxshuju[0]){
                res[maxshuju[1]] = cha[j];
            }
        }
        res[0] = res[0]+avg;
        res[1] = res[1]+avg;
        res[2] = res[2]+avg;

        return res;
    }

    public static int[] getMax(int[] res){
        int[] shuju = new int[2];
        int maxabs = Math.abs(res[0]);
        int maxIndex = 0;
        for (int i = 0; i < res.length; i++) {
            if (maxabs<Math.abs(res[i])){
                maxabs = Math.abs(res[i]);
                maxIndex = i;
            }
        }
        shuju[0] = maxabs;
        shuju[1] = maxIndex;
        return shuju;
    }
}
