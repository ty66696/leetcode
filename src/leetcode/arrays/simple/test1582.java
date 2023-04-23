package leetcode.arrays.simple;

public class test1582 {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1){
                    boolean flag = true;
                    for (int m = 0; m < mat[0].length; m++) {
                        if (mat[i][m] == 1 && m != j) {
                            flag = false;
                            break;
                        }
                    }
                    for (int m = 0; m < mat.length; m++) {
                        if(mat[m][j]==1&&m!=i){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
