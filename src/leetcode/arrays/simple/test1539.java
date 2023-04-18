package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        findKthPositive(arr,k);
    }
    public static int findKthPositive(int[] arr, int k) {
        int index = 1;
        int count = 0;
        for (int i : arr) {
            while (i!=index){
                count++;
                if(k==count)
                    return index;
                index++;
            }
            index++;
        }
        int i = k - count;
        return arr[arr.length-1]+i;
    }
}
