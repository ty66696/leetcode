package leetcode.arrays.simple;

import java.util.*;

public class test0448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] m = new int[length];
        for (int num : nums) {
            m[num-1]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            if(m[i]<1)
                list.add(i+1);
        }
        return list;
    }
}
