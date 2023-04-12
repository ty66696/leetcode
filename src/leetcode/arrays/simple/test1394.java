package leetcode.arrays.simple;

import java.util.HashMap;
import java.util.Map;

public class test1394 {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value==key){
                if(value>max){
                    max = value;
                }
            }
        }
        return max>0?max:-1;
    }
}
