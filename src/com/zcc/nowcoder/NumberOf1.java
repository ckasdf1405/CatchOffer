package com.zcc.nowcoder;

/**
 * 输出一个整数的二进制表示中的1的个数
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count =0;
        char[] array = Integer.toBinaryString(n).toCharArray();
            for (int i =0;i<array.length;i++){
                if (array[i] =='1'){
                    count++;
                }
            }
        return count;
    }
}
