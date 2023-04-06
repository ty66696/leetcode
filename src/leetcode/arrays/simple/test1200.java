package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]<min)
                min = arr[i+1]-arr[i];
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]==min){
                List<Integer> list1 = new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }

        }
        return list;
    }
}
