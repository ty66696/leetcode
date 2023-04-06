package leetcode.arrays.simple;

public class test1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int m = coordinates[1][1] - coordinates[0][1];
        int n = coordinates[1][0] - coordinates[0][0];
        for(int i=2;i<coordinates.length;i++){
            int a = coordinates[i][1] - coordinates[0][1];
            int b = coordinates[i][0] - coordinates[0][0];
            if(m*b!=n*a)
                return false;
        }
        return true;
    }
}
