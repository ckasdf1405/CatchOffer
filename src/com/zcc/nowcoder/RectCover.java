package com.zcc.nowcoder;


/**
 * 2*1去覆盖2*1的矩形，1种方式
 * 2*1去覆盖2*2的矩形，2种方式(...旋转方向也算一种)
 * 2*1去覆盖2*3的矩形，f(3)=3
 * 2*1去覆盖2*4的矩形，f(4)=f(4-1)+f(4-2)
 * 2*1去覆盖2*5的矩形，f(5)=f(4)+f(3)
 */
public class RectCover {
    public int rectCover(int target){
        if (target <=0){
            return 0;
        }
        else if (target ==1 || target ==2){
            return target;
        }
        else{
            return rectCover(target-1) + rectCover(target-2);
        }
    }
}
