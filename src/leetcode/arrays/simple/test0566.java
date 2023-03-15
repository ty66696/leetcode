package leetcode.arrays.simple;

public class test0566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int t = mat.length;
        int y = mat[0].length;
        if(t*y!=r*c)
            return mat;
        int num[][]  = new int[r][c];
        int m=0,n=0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < y; j++) {
                num[m][n++] = mat[i][j];
                if(n==c){
                    n=0;
                    m++;
                }
            }
        }
        return num;
    }
}
