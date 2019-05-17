package com.zcc.nowcoder;

public class FindArray {


    public static void main(String[] args) {
        int t =20;
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findArray(t,a));
    }

    public static boolean findArray(int t,int[][] array){
        int i,j;
        for (i=0;i<array.length;i++){
            for (j=0;j<array[0].length;j++){
                if (t != array[i][j]){
                }else
                    return true;
            }
        }
        return false;
    }

    public boolean findArray2(int t,int[][] array){
        int i = array.length-1;
        int j =0;
        while (i >=0 && j<array[0].length){
            if (t<array[i][j]){
                i--;
            }else if (t>array[i][j]){
                j++;
            }else
                return true;
        }
        return false;
    }
}
