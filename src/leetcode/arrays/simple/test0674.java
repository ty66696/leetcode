package leetcode.arrays.simple;

public class test0674 {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int max=len;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                len++;
            }else {
                if(len>max)
                    max=len;
                len=1;
            }
        }
        return len;
    }
}
