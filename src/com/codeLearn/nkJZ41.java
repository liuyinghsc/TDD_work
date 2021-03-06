package com.codeLearn;

import java.util.ArrayList;

//他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
// 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
public class nkJZ41 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i <sum/2+2 ; i++) {
            int temp =0;
            int j = i;
            while (temp<sum){
                temp+=j;
                j++;
            }
            if (temp==sum){
                ArrayList<Integer> inlist = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    inlist.add(k);
                }
                res.add(inlist);
            }
        }
        return res;
    }

}
