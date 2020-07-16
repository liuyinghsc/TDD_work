package com.codeLearn;

//例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，
public class nkJZ30_maxSubStrSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 3};
        int k = FindGreatestSumOfSubArray(arr);
        System.out.println(k);
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        int maxLenSum = array[0];
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int sum = array[i] + dp[i - 1];
            if (sum > array[i]) {
                dp[i] = sum;
            } else {
                dp[i] = array[i];
            }
            if (dp[i] > maxLenSum) {
                maxLenSum = dp[i];
            }
        }
        return maxLenSum;
    }

    //溢出
    public int FindGreatestSumOfSubArrayNK(int[] array) {
        int maxLenSum = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                maxLenSum = Math.max(sum, maxLenSum);
            }
            sum = 0;
        }
        return maxLenSum;
    }

    public int FindGreatestSumOfSubArrayLC(int[] array) {
        int maxLenSum = array[0];
        int sum = 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = dp[i - 1] + array[i];
            if (sum > array[i]) {
                dp[i] = sum;
            }else {
                dp[i] = array[i];
            }
            maxLenSum = Math.max(maxLenSum,dp[i]);
        }
        return maxLenSum;
    }
}

