package leetcode.arrays.simple;

public class test0724 {
    public int pivotIndex(int[] nums) {
        for (int i = 1;i<nums.length-1;i++){
            int sum1=0,sum2=0;
            for(int m=0;m<i;m++){
                sum1=sum1+nums[m];
            }
            for(int m=i+1;m<nums.length;m++){
                sum2=sum2+nums[m];
            }
            if(sum1==sum2)
                return i;
        }
        return -1;
    }
}
