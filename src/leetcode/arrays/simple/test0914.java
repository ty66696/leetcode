package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test0914 {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            list.add(value);
        }
        int temp = list.get(0);
        for (Integer integer : list) {
            if(integer>temp){
                temp= gys(integer,temp);
            }else {
                temp = gys(temp,integer);
            }
        }
        return temp>=2;
    }

    private int gys(Integer value, Integer value1) {
        while (value1!=0)
        {
            int r = value % value1;
            value = value1;
            value1 = r;
        }
        return value;
    }
}
