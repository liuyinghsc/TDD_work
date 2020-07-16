package com.codeLearn;

//,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
// LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
// 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
public class nkJZ45 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 7, 11, 0};
        boolean continuous = isContinuous(arr);
        System.out.println(continuous);
    }

    public static boolean isContinuous(int[] numbers) {
        if (numbers.length<5){
            return false;
        }
//        converseOthers(numbers);
        int[] res = new int[14];
        int min = 20;
        int max = -1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 13 || numbers[i] < 0) {
                return false;
            }
            if (numbers[i] == 0) {
                res[numbers[i]]++;
            } else if (numbers[i] != 0 && res[numbers[i]] == 0) {
                res[numbers[i]] = 1;
            } else {
                return false;
            }
            if (numbers[i] != 0 && min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }

        }
        if ((max - min) < 5) {
            return true;
        }
        return false;
    }

//    private int getMin(int[] numbers, int[] d) {
//        int min = 20;
//        for (int i = 0; i < numbers.length; i++) {
//            if (d[numbers[i]] == 0) {
//                d[numbers[i]] = 1;
//            }else {
//                return 
//            }
//            if (numbers[i] != 'd' && numbers[i] != 'x' && numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        return min;
//    }

//    private static void converseOthers(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 'A') {
//                numbers[i] = 1;
//            }
//            if (numbers[i] == 'J') {
//                numbers[i] = 11;
//            }
//            if (numbers[i] == 'Q') {
//                numbers[i] = 12;
//            }
//            if (numbers[i] == 'K') {
//                numbers[i] = 13;
//            }
//        }
//    }
}
