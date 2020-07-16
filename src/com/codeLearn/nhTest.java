package com.codeLearn;

public class nhTest {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        new nhTest().getNear(arr);
//        new nhTest().quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

    }


    public int getNear(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        quickSort(arr, 0, arr.length - 1);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        return arr[0];


    }
    //    nomal  quickSort
    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = getPivot(arr, start, end);
            quickSort(arr, 0, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }


    public int getPivot(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && pivot <= arr[j]) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (pivot > arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = pivot;
        return i;
    }
}
