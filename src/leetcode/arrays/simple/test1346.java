package leetcode.arrays.simple;

import java.util.Arrays;

public class test1346 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            if(k>0) {
                for (int j = i + 1; j < arr.length && arr[j] <= 2 * k; j++) {
                    if (arr[j] == 2 * k)
                        return true;
                }
            }
            else {
                for (int j = 0; j < i &&arr[j]<= 2*k; j++) {
                    if (arr[j] == 2 * k)
                        return true;
                }
            }
        }
        return false;
    }
}
