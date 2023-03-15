package leetcode.arrays.simple;

public class test0485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int index=0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1)
                index++;
            else{
                if(index>max) {
                    max = index;
                }
                index=0;
            }
        }
        return Math.max(index,max);
    }
}
