package leetcode.arrays.simple;

import java.util.*;

public class test0414 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        thirdMax(nums);
    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        if(list.size()>=3)
            return list.get(list.size()-3);
        else
            return list.get(list.size()-1);
    }
}
