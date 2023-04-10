package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i=i+2) {
            int k = nums[i];
            int j = nums[i+1];
            for (int m = 0; m < k; m++) {
                list.add(j);
            }
        }
        int[] num = new int[list.size()];
        for (int i = 0; i < num.length; i++) {
            num[i] = list.get(i);
        }
        return num;
    }

}
