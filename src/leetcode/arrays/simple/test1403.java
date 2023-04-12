package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test1403 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] ints = Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
        int sum2 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            sum2=sum2+ints[i];
            list.add(ints[i]);
            if(sum2*2>sum){
                break;
            }
        }
        return list;
    }
}
