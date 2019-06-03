package com.zcc.nowcoder;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrixCircle {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix ==null ||matrix.length ==0) return list;
        int i=matrix.length-1;
        int j=matrix[0].length-1;
        while (i>=0 || j>=0) {
            print(matrix, matrix.length-1-i, matrix[0].length-1-j, i, j, list);
            i--;
            j--;
        }
        return list;
    }


    private static void print(int[][] matrix, int startRow, int startCol, int endRow, int endCol, ArrayList<Integer> list){
        if (startRow<endRow && startCol<endCol){
            for (int j=startCol;j<=endCol;j++) list.add(matrix[startRow][j]); //向右打印
            for (int i=startRow+1;i<=endRow-1;i++) list.add(matrix[i][endCol]);//向下打印
            for (int j=endCol;j>=startCol;j--) list.add(matrix[endRow][j]); //向左打印
            for (int i=endRow-1;i>=startRow+1;i--) list.add(matrix[i][startCol]); //向上打印
        }else if (startRow<endRow && startCol==endCol){
            for (int i=startRow;i<=endRow;i++) list.add(matrix[i][endCol]);
        }else if (startRow==endRow && startCol<endCol){
            for (int j=startCol;j<=endCol;j++) list.add(matrix[startRow][j]);
        }else if (startRow==endRow && startCol==endCol){
            list.add(matrix[startRow][startCol]);
        }
    }


    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] b={{1}};
        ArrayList<Integer> list1 = printMatrix(a);
        ArrayList<Integer> list = printMatrix(b);
        System.out.println(list1);
        System.out.println(list);
    }
}