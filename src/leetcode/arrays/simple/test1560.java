package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] num = new int[n+1];
        for (int i = 0; i < rounds.length-1; i++) {
            if(rounds[i+1]<rounds[i]){
                for(int j = rounds[i];j<=n;j++){
                    num[j]++;
                }
                for(int j = 1;j<rounds[i+1];j++){
                    num[j]++;
                }
            }else {
                for(int j = rounds[i];j<rounds[i+1];j++){
                    num[j]++;
                }
            }
        }
        num[rounds[rounds.length-1]]++;
        int max = Integer.MIN_VALUE;
        for (int i : num) {
            if(i>max)
                max = i;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if(num[i]==max){
                list.add(i);
            }
        }
        return list;
    }
}
