package leetcode.arrays.simple;

public class test0643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
            max = sum;
        }
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (max < sum)
                max = sum;
        }
        return max/k;
    }
}
