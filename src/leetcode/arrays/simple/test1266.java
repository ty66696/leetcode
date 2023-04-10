package leetcode.arrays.simple;

public class test1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int index = 0;
        for (int i = 1; i < points.length; i++) {
            index = index+Math.max(Math.abs(points[i][1]-points[i-1][1]),Math.abs(points[i][0]-points[i-1][0]));
        }
        return index;
    }
}
