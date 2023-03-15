package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if(!hm.containsKey(nums1[i])){
                hm.put(nums1[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(hm.containsKey(nums2[i]))
                hs2.add(nums2[i]);
        }
        int[] num = new int[hs2.size()];
        int i=0;
        for (Integer integer : hs2) {
            num[i++] = integer;
        }
        return num;
    }
}
