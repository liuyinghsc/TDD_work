package com.codeLearn;

import java.util.Arrays;

public class paixu {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 2, 4, 3};
        System.out.println(Arrays.toString(pupleSort(arr)));

    }

    public static int[] pupleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] chooseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mindex = i;
//            找到最小的数
            for (int j = i; j < arr.length; j++) {
                if (arr[mindex] > arr[j]) {
                    mindex = j;
                }
            }
            int temp = arr[mindex];
            arr[mindex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //插入
    public int[] insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    //
//归并
    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index++] = right[j++];
            } else if (j >= right.length) {
                result[index++] = left[i++];
            } else if (left[i] > right[j]) {
                result[index++] = right[j++];
            } else {
                result[index++] = right[i++];
            }
        }
        return result;
    }

    //希尔排序
    public int[] shellSort(int[] arr) {
        int temp = 0;
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                temp = arr[i];
                int preIndex = i - gap;
                while (preIndex > 0 && arr[preIndex] > temp) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex = preIndex - gap;
                }
                arr[preIndex + gap] = temp;
            }
            gap = gap / 2;
        }
        return arr;
    }
//快排
    public void quickSort(int[] arr,int low,int high) {
        if (low<high){
            int index = getPrivot(arr, 0, arr.length);
            quickSort(arr,0,index);
            quickSort(arr,index+1,arr.length);
        }
    }

    public static int getPrivot(int[] arr, int low, int high) {
        int pri = arr[0];
        int i = low;
        int j = high;
        while (i < j) {
            if (i < j && arr[j] > pri) {
                j--;
            }
            if (i<j){
                arr[i] = arr[j];
                i++;
            }
            if (i<j&&arr[i]<pri){
                i++;
            }
            if (i<j){
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = pri;
        return i;
    }

}
