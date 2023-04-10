package leetcode.arrays.simple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class test1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] num = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int index = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1)
                    index++;
            }
            num[i][0] = i;
            num[i][1] = index;
        }
        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int[] n = new int[k];
        for (int i = 0; i < k; i++) {
            n[i] = num[i][0];
        }
        return n;
    }
}
