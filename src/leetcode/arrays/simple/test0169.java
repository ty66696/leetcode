package leetcode.arrays.simple;

import java.util.HashMap;
import java.util.Map;

public class test0169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else
                hm.put(num,1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            if(value>=nums.length/2){
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }
}
