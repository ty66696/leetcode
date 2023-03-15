package leetcode.arrays.simple;

import java.util.Arrays;

public class test0645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] num2 = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1])
                num2[0]=nums[i];
            else if(nums[i]+2==nums[i+1])
                num2[1]=nums[i]+1;
        }
        if(nums[nums.length-1]!=nums.length)
            num2[1]=nums.length;
        if(nums[0]!=0)
            num2[1] = 1;
        return num2;
    }
}

