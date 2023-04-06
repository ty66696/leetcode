package leetcode.arrays.simple;

public class test1217 {
    public int minCostToMoveChips(int[] position) {
        int sum1=0,sum2=0;
        for (int i : position) {
            if(i%2==0)
                sum1++;
            else
                sum2++;
        }
        return Math.min(sum1,sum2);
    }

}
