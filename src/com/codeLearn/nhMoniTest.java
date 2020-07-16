package com.codeLearn;

//给定一个四位整数n(用abcd表示)，让你算出从1-n的整数中包含1的个数。
// 题目大概是这样，比如12，那么1 10 11 12共有5个1。
public class nhMoniTest {
    public static void main(String[] args) {
        int times = getPresent1(12);
        System.out.println(times);

    }
    public static int getPresent1(int n){
        int count =0;
        for (int i = 1; i <=n; i++) {
            count+=get1(i);
        }
        return count;
    }

    private static int get1(int i) {
        String s = i+"";
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j)=='1'){
                sum++;
            }
        }
        return sum;
    }


    //方法错误，因为不是二进制数，所以与操作会有错！
    public static int get1Times(int n) {
        int count = 0;

        int k = n;
        int flag = 1;
        int w = 10;
        if (k / w > 0) {
            flag = flag + w;
            w = w * 10;
        }
        for (int i = 16; i <= n; i++) {
            int zj = i;
            if ((zj & flag) != 0) {
                while (zj > 0) {
                    if ((zj % 10) == 1) {
                        count++;
                    }
                    zj = zj / 10;
                }
            }
        }
        return count;
    }

}
