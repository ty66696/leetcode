package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            int k = index[i];
            list.add(k,nums[i]);
        }
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
