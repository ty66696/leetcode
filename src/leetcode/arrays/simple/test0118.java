package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test0118 {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if(numRows==1)
            return list;
        list2.add(1);
        list2.add(1);
        if(numRows==2)
            return list;
        list.add(list2);
        for (int i = 2; i < numRows ; i++) {
            List<Integer> list3 = new ArrayList<>();
            int size = list.get(i-1).size();
            list3.add(1);
            for (int i1 = 0; i1 < size-1; i1++) {
                list3.add(list.get(i-1).get(i1) + list.get(i-1).get(i1 + 1));
            }
            list3.add(1);
            list.add(list3);
        }
        return list;
    }
}
