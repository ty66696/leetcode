package leetcode.arrays.simple;

import java.awt.font.NumericShaper;
import java.util.Arrays;

public class test0908 {
    public static void main(String[] args) {
        int[] nums = {0,10};
        int k = 2;
        smallestRangeI(nums,k);
    }
    public static int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[nums.length-1]-nums[0]>2*k){
            return nums[nums.length-1]-nums[0]-2*k;
        }else
            return 0;
    }
}
