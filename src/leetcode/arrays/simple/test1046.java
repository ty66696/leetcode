package leetcode.arrays.simple;


import java.util.*;

public class test1046 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        lastStoneWeight(stones);
    }
    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
        list.sort((o1, o2) -> (o2 - o1));
        while (list.size()>1){
            int a = list.get(0);
            int b = list.get(1);
            list.remove(0);
            list.remove(0);
            if(a!=b)
                list.add(a-b);
            list.sort((o1, o2) -> (o2 - o1));
        }
        if(list.size()==0)
            return 0;
        return list.get(0);
    }
}
