package leetcode.arrays.simple;

public class test1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] num = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int p = indices[i][0];
            int q = indices[i][1];
            for(int j = 0;j<n;j++){
                num[p][j]++;
            }
            for(int j = 0;j<m;j++){
                num[j][q]++;
            }
        }
        int index=0;
        for (int i = 0; i < num.length; i++) {
            for (int i1 = 0; i1 < num[0].length; i1++) {
                if(num[i][i1]%2==1)
                    index++;
            }
        }
        return index;
    }
}
