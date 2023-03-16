package leetcode.arrays.simple;

import javax.jws.soap.SOAPBinding;

public class test0746 {
    public int minCostClimbingStairs(int[] cost) {
        int sum = 0;
        for (int i = 0; i < cost.length; ) {
            if(i<cost.length-2&&cost[i+2]<=cost[i+1]){
                sum=sum+cost[i];
                i=i+2;
            }else {
                sum = sum + cost[i+1];
                i=i+1;
            }
        }
        return sum;
    }
}
