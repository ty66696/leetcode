package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test0228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        String s ="";
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int j = nums[i];
            while (i<nums.length&&j==nums[i]){
                j++;
                i++;
            }
            j--;
            i--;
            if(k!=j)
                s = k+"->"+j;
            else
                s=s+k;
            list.add(s);
            s="";
        }
        return list;
    }
}
