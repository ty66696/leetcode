package leetcode.arrays.simple;

public class test0896 {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        while (i<nums.length-1&&nums[i]==nums[i+1]){
            i++;
        }
        if(i==nums.length-1)
            return true;
        if(nums[i]-nums[i+1]<0){
            for (int j = i+1; j < nums.length-1; j++) {
                if(nums[j]-nums[j+1]>0)
                    return false;
            }
        }else if(nums[i]-nums[i+1]>0){
            for (int j = i+1; j < nums.length-1; j++) {
                if(nums[j]-nums[j+1]<0)
                    return false;
            }
        }
        return true;
    }
}
