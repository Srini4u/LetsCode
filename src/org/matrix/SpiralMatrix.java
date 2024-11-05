package org.matrix;
/*
    Given an m x n matrix, return all elements of the matrix in spiral order.

            Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
            Output: [1,2,3,6,9,8,7,4,5]

            Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
            Output: [1,2,3,4,8,12,11,10,9,5,6,7]

    Constraints:
            m == matrix.length
            n == matrix[i].length
            1 <= m, n <= 10
            -100 <= matrix[i][j] <= 100
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpiralMatrix {

    public static void main(String[] args){
        int[][] matrixArray = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[] testMatrix = spiralMatrixOrder(matrixArray);
        System.out.println("testMatrix>> "+testMatrix);
    }

    public static int[] spiralMatrixOrder(int[][] inputMatrixArray){
        int[] arrayResult = new int[]{};

        return arrayResult;
    }

}
