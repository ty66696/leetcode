package leetcode.arrays.simple;

import java.util.Arrays;

public class test1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        for (int num : nums) {
            if(num<0)
                index++;
            if(num>0)
                break;
        }
        if(k<=index){
            for (int i = 0; i < k; i++) {
                nums[i] = -nums[i];
            }
        }else {
            if(k%2==0){
                if(index%2==0){
                    for (int i = 0; i < index; i++) {
                        nums[i]=-nums[i];
                    }
                }else {
                    for (int i = 0; i < index; i++) {
                        nums[i]=-nums[i];
                    }
                    Arrays.sort(nums);
                    nums[0]=-nums[0];
                }
            }else {
                if(index%2==0){
                    for (int i = 0; i < index; i++) {
                        nums[i]=-nums[i];
                    }
                    Arrays.sort(nums);
                    nums[0]=-nums[0];
                }else {
                    for (int i = 0; i < index; i++) {
                        nums[i]=-nums[i];
                    }
                }
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum=sum+num;
        }
        return sum;
    }
}
