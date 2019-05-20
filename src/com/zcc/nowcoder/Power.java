package com.zcc.nowcoder;

import javax.sound.midi.SoundbankResource;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
public class Power {
    public static double Power(double base, int exponent) {
        if (exponent ==0){
            return 1;
        }
        else if (exponent>0){
            return base * Power(base,exponent-1);
        }else {
            return 1/base * Power(base,exponent+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Power(2,-3));
    }
}
