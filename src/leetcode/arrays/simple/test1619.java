package leetcode.arrays.simple;

import java.util.Arrays;

public class test1619 {
    public double trimMean(int[] arr) {
        int v = (int) (arr.length * 0.05);
        int length = arr.length - v - v;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = v; i < arr.length - v; i++) {
            sum = sum + arr[i];
        }
        double k = sum*1.00000 / length;
        return k;
    }
}
