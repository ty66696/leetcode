package leetcode.arrays.simple;

public class test0598 {
    public int maxCount(int m, int n, int[][] ops) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int[] op : ops) {
            if(op[0]<min1)
                min1 = op[0];
            if(op[1]<min2)
                min2=op[1];
        }

        if(ops.length==0)
            return m*n;
        else
            return min1*min2;
    }
}
