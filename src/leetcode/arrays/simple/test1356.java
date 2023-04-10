package leetcode.arrays.simple;

import java.util.Arrays;
import java.util.Comparator;

public class test1356 {
    public int[] sortByBits(int[] arr) {
        Integer newNums[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(newNums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(num(o1)==num(o2))
                    return o1-o2;
                else
                    return num(o1)-num(o2);
            }
        });
        int[] ints = Arrays.stream(newNums).mapToInt(Integer::valueOf).toArray();
        return ints;
    }
    public static int num(int num){
        String s = Integer.toBinaryString(num);
        int length = s.length();
        String s1 = s.replaceAll("1", "");
        return length-s1.length();
    }
}
