package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test0830 {
    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        largeGroupPositions(s);
    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        char c = s.charAt(0);
        int index1 = 0;
        int index2 = 0;
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                if(index2-index1>=2){
                    List<Integer> list = new ArrayList<>();
                    list.add(index1);
                    list.add(index2);
                    listList.add(list);

                }
                index1 = i;
                index2 = i;
            }
            else {
                index2++;
            }
            c = s.charAt(i);
        }
        return listList;
    }
}
