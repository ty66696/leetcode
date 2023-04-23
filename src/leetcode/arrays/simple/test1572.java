package leetcode.arrays.simple;

public class test1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = mat[i][i] + sum;
            sum = mat[i][mat.length-i-1] + sum;
            if(mat.length-i-1==i){
                sum=sum-mat[i][i];
            }
        }
        return sum;
    }
}
