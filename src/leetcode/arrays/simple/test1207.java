package leetcode.arrays.simple;

import java.util.*;

public class test1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            list.add(value);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            if((int)list.get(i+1)==(int)list.get(i)){
                return false;
            }
        }
        return true;
    }
}
