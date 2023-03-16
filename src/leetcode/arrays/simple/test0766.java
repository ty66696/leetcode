package leetcode.arrays.simple;

import java.util.List;

public class test0766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            int m=0,k=i;
            while (m<matrix.length-1&&k<matrix[0].length-1){
                if(matrix[m][k]!=matrix[m+1][k+1]){
                    return false;
                }
                m++;
                k++;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            int m=i,k=0;
            while (m<matrix.length-1&&k<matrix[0].length-1){
                if(matrix[m][k]!=matrix[m+1][k+1]){
                    return false;
                }
                m++;
                k++;
            }
        }
        return true;
    }
}
