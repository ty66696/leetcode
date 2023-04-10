package leetcode.arrays.simple;

public class test1351 {
    public int countNegatives(int[][] grid) {
        int index=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]<0)
                    index++;
            }
        }
        return index;
    }
}
