package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(hm1.containsKey(nums1[i])){
                hm1.put(nums1[i], hm1.get(nums1[i])+1);
            }else
                hm1.put(nums1[i],1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(hm2.containsKey(nums2[i])){
                hm2.put(nums2[i], hm2.get(nums2[i])+1);
            }else
                hm2.put(nums2[i],1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm1.entrySet()) {
            Integer key = integerIntegerEntry.getKey();
            if(hm2.containsKey(key)){
                int min = Math.min(integerIntegerEntry.getValue(), hm2.get(key));
                for (int i = 0; i < min; i++) {
                    list.add(key);
                }
            }
        }
        int[] num = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            num[i++] = integer;
        }
        return num;
    }
}
