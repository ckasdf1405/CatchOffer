package com.zcc.nowcoder;


/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * （先后次序不同算不同的结果）
 * n阶台阶的跳法数 = （n-1）级台阶的跳法数 +（n-2）级台阶的跳法数
 * 可以知道，此问题是一个fibonacci数列第n项的问题
 */
public class JumpFloor {

    public int jumpFloor(int n){
        int a=1,b=2,c=0;
        if (n==1 || n==2){
            return n;
        }else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
