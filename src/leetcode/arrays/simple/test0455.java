package leetcode.arrays.simple;

import java.util.Arrays;

public class test0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        for (int i = 0,j=0; i < s.length&&j<g.length;) {
            if(g[j]<=s[i]){
                index++;
                j++;
                i++;
            }else {
                i++;
            }
        }
        return index;
    }
}
