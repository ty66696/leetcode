package leetcode.arrays.simple;

import java.util.HashSet;

public class test0575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : candyType) {
            hs.add(i);
        }
        int k = candyType.length / 2;
        if(hs.size()>k)
            return k;
        else
            return hs.size();
    }
}
