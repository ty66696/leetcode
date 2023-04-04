package leetcode.arrays.simple;

import java.util.Arrays;

public class test1051 {
    public int heightChecker(int[] heights) {
        int[] num = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count=0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=num[i])
                count++;
        }
        return count;
    }
}
