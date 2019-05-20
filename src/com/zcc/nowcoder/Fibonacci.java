package com.zcc.nowcoder;


//斐波那契数列,输出斐波那契数列的第N项
public class Fibonacci {
    public static int fibonacci(int n) {
        int a=1,b=1,c=0;

            if (n<=0){
                return 0;
            }else if (n ==1 || n ==2){
                return 1;
            }else {
                for (int i=3;i<=n;i++){
                    c=a+b;
                    a=b;
                    b=c;
                }
                return c;
            }
        }



    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
