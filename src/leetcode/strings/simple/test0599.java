package leetcode.strings.simple;

import java.util.HashMap;

public class test0599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int index = 10000;
        String[] strings = new String[10000];
        int k = 0;
        for (int i = 0; i < list1.length; i++) {
            String s = list1[i];
            for (int i1 = 0; i1 < list2.length; i1++) {
                if (list2[i1].equals(s)) {
                    if (i + i1 < index) {
                        index = i+i1;
                    }
                }
            }
        }
        for (int i = 0; i < list1.length; i++) {
            String s = list1[i];
            for (int i1 = 0; i1 < list2.length; i1++) {
                if (list2[i1].equals(s)) {
                    if (i + i1 == index) {
                        strings[k++] = s;
                    }
                }
            }
        }
        String[] strings1 = new String[k];
        for (int i1 = 0; i1 < k; i1++) {
            strings1[i1] = strings[i1];
        }
        return strings1;
    }
}
