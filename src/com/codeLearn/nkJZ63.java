package com.codeLearn;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
//如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
// 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
// 那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
public class nkJZ63 {
    public static void main(String[] args) {
        getMid s = new getMid();
        int[] liu = {5,2,3,4,1,6,7,0,8};
        double[] res = new double[liu.length];
        for (int i = 0; i < liu.length; i++) {
            s.Insert(liu[i]);
            Double aDouble = s.GetMedian();
            res[i] = aDouble;
        }
        System.out.println(Arrays.toString(res));
    }
  
}

class getMid{
    LinkedList<Integer> list = new LinkedList<>();
    public void Insert(Integer num) {
        list.add(num);
    }
    public Double GetMedian() {
        Collections.sort(list);
        double midnum = 0;
        if (list.size()==1){
            return (double)list.get(0);
        }
        int mid = list.size() / 2;
        if (list.size() % 2 != 0) {
            midnum = list.get(mid);
        } else {
            midnum = (list.get(mid) + list.get(mid - 1)) / 2.0;
        }
        return midnum;
    }
}
