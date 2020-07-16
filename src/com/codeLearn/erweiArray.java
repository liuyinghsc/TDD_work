package com.codeLearn;

public class erweiArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        boolean erweiArray = getErweiArray(arr, 2);
        System.out.println(erweiArray);
    }

    public static boolean getErweiArray(int[][] arr,int target){
        int mid =0;
        for (int i = 0; i < arr.length; i++) {
            int low =0;
            int high = arr[i].length-1;
            while (low<=high){
                mid = (low+high)/2;
                if (target<arr[i][mid]){
                    high = mid-1;
                }else if (target>arr[i][mid]){
                    low = mid +1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
