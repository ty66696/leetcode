package leetcode.arrays.simple;

public class test0867 {
    public int[][] transpose(int[][] matrix) {
        int[][] num = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                num[j][i] = matrix[i][j];
            }
        }
        return num;
    }

}
