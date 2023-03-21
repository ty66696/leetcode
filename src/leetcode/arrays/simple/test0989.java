package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test0989 {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        addToArrayForm(num,k);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        String[] split = String.valueOf(k).split("");
        int m = 0;
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1, j = split.length - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            list.add((num[i] + Integer.parseInt(split[j]) + m) % 10);
            m = (num[i] + Integer.parseInt(split[j]) + m) / 10;
        }
        if (i > 0) {
            while (i >= 0) {
                list.add((num[i] + m) % 10);
                m = (num[i] + m) / 10;
                i--;
            }
        } else if (j > 0) {
            while (j >= 0) {
                list.add((Integer.parseInt(split[j]) + m) % 10);
                m = (Integer.parseInt(split[j]) + m) / 10;
                j--;
            }
        }
        if ( m != 0) {
            list.add(1);
        }

        Collections.reverse(list);
        return list;
    }
}
