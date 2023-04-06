package leetcode.arrays.simple;

import java.util.*;

public class test1128 {
    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        numEquivDominoPairs(dominoes);
    }
    public static int numEquivDominoPairs(int[][] dominoes) {

        int index = 0;
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            int m = dominoes[i][0];
            int n = dominoes[i][1];
            String a = m+","+n;
            String b = n+","+m;
            if(hm.containsKey(a)||hm.containsKey(b)){
                if(hm.containsKey(a))
                    hm.put(a,hm.get(a)+1);
                else
                    hm.put(b,hm.get(b)+1);
            }else {
                hm.put(a,1);
            }
        }
        Collection<Integer> values = hm.values();
        for (Integer value : values) {
            if(value>1){
                int sum = 1;
                sum=value*(value-1)/2;
                index = index+sum;
            }
        }
        return index;
    }
}
