package leetcode.arrays.simple;

import java.util.Arrays;

public class test1122 {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1,arr2);
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int m=0,n=0;
        for (int i = 0; i < arr2.length; i++) {
            int k = arr2[i];
            n = m;
            for(;m<arr1.length&&n<arr1.length;n++){
                if(arr1[n]==k){
                    int temp = arr1[m];
                    arr1[m] = arr1[n];
                    arr1[n] = temp;
                    m++;
                }
            }
        }
        Arrays.sort(arr1,m,arr1.length);
        return arr1;
    }
}
