package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        sortPeople(names,heights);
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> hm = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            hm.put(heights[i],names[i]);
        }
        String[] sort = new String[names.length];
        int i=0;
        for (Map.Entry<Integer, String> integerStringEntry : hm.entrySet()) {
            String value = integerStringEntry.getValue();
            sort[names.length-1-i] = value;
        }
        return sort;
    }
}
