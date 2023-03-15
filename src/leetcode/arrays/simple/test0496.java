package leetcode.arrays.simple;

import java.util.Arrays;

public class test0496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] k = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int m = nums1[i];
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if(m==nums2[i1]){
                    for(int n = i1;n<nums2.length;n++){
                        if(nums2[n]>m){
                            k[i] = nums2[n];
                            break;
                        }
                    }
                    if(k[i]==0)
                        k[i]=-1;
                    break;
                }
            }
        }
        return k;
    }
}
