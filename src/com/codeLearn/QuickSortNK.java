package com.codeLearn;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortNK {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,6};
        QuickSortNK(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSortNK(int[] arr, int start, int end) {
        if (start < end) {
            int pri = getPri(arr, start,end);
            QuickSortNK(arr,start,pri);
            QuickSortNK(arr,pri+1,end);
        }
    }

    public static int getPri(int[] arr, int left, int right) {
        int pri = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            if (pri <= arr[j] && i < j) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            if (pri > arr[j] && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = pri;
        return i;
    }
}
