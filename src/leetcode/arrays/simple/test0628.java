package leetcode.arrays.simple;

import java.util.Arrays;

public class test0628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sum = 1;
        for (int i = nums.length - 1; i >= nums.length-3; i--) {
            sum=sum*nums[i];
        }
        int k = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(k,sum);
    }
}
