package leetcode.arrays.simple;

public class test0905 {
    public int[] sortArrayByParity(int[] nums) {
        int m=0,n=nums.length-1;
        while (m<n) {
            while (m<n&&nums[m]%2==0){
                m++;
            }
            while (n>m&&nums[n]%2==1){
                n--;
            }
            int temp = nums[m];
            nums[m]=nums[n];
            nums[n] = temp;

        }
        return nums;
    }
}
