package leetcode.arrays.simple;

public class test0883 {
    public static void main(String[] args) {
        int[][] grid  ={{1,0},{0,2}};
        projectionArea(grid);
    }
    public static int projectionArea(int[][] grid) {
        int sum=0;

        for (int i = 0; i < grid.length; i++) {
            int max1 = Integer.MIN_VALUE;
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]>0)
                    sum++;
                if(grid[i][j]>max1)
                    max1=grid[i][j];
            }
            sum=sum+max1;
        }
        for (int i = 0; i < grid.length; i++) {
            int max1 = Integer.MIN_VALUE;
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[j][i]>max1)
                    max1=grid[j][i];
            }
            sum=sum+max1;
        }
        return sum;
    }
}
