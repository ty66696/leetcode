package leetcode.arrays.simple;

import java.util.HashMap;
import java.util.Map;

public class test0997 {
    public int findJudge(int n, int[][] trust) {
        if(n==1&&trust.length==0)
            return n;
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            hm.put(trust[i][1],hm.getOrDefault(trust[i][1],0)+1);
            hm2.put(trust[i][0],hm.getOrDefault(trust[i][0],0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            if(value ==n-1&hm2.get(integerIntegerEntry.getKey())==0)
                return integerIntegerEntry.getKey();
        }
        return -1;
    }
}
