package leetcode.arrays.simple;

public class test1037 {
    public boolean isBoomerang(int[][] points) {
        int a = points[0][1]-points[1][1];
        int b = points[0][0]-points[1][0];
        int c = points[1][1]-points[2][1];
        int d = points[1][0]-points[2][0];
        if(a*d!=c*b){
            return true;
        }else
            return false;
    }
}
