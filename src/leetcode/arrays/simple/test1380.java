package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            boolean flag = true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][index]>min){
                    flag = false;
                    break;
                }
            }
            if(flag)
                list.add(min);
        }
        return list;
    }
}
