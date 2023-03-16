package leetcode.arrays.simple;

import java.util.Arrays;

public class test0704 {
    public int search(int[] nums, int target) {
        int i = nums.length / 2;
        if(nums[i]>target){
            int[] copy = Arrays.copyOfRange(nums, 0, i);
            search(copy,target);
        }else if(nums[i]<target){
            int[] copy = Arrays.copyOfRange(nums, i+1, nums.length);
            search(copy,target);
        }else
            return i;
        return -1;
    }
}
