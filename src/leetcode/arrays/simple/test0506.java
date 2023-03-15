package leetcode.arrays.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test0506 {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            hm.put(score[i],i);
        }
        Arrays.sort(score);
        String[] m = new String[score.length];
        int k=0;
        if(score.length==1)
            m[0]="Gold Medal";
        for (int i = score.length-1; i >= 0; i--) {
            k++;
            if(i==score.length-1){
                m[hm.get(score[i])]="Gold Medal";
            }else if(i==score.length-2){
                m[hm.get(score[i])]="Silver Medal";
            }else if(i==score.length-3){
                m[hm.get(score[i])]="Bronze Medal";
            }else
                m[hm.get(score[i])]=k+"";
        }
        return m;
    }
}
