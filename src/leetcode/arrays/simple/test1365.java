package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = list.indexOf(num);
            nums[i] = index;
        }
        return nums;
    }
}
