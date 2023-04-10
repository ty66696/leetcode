package leetcode.arrays.simple;

import java.util.*;

public class test1331 {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = 0;
        for (Integer integer : list) {
            hm.put(integer,++i);
        }
        int[] num = new int[arr.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = hm.get(arr[j]);
        }
        return num;
    }
}
