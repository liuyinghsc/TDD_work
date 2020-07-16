package com.codeLearn;

import java.util.HashMap;
import java.util.Map;

public class nkJZ40_appearOnceNums {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,1,4,2};
        FindNumsAppearOnce(arr,new int[1],new int[1]);

    }
    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], 2);
            }
        }
        int[] ints = new int[2];
        int k =0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(1)){
                ints[k]= (int) entry.getKey();
                k++;
            }
        }
        num1[0] = ints[0];
        num2[0] = ints[1];
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
