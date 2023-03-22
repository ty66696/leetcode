package leetcode.arrays.simple;

public class test0941 {
    public boolean validMountainArray(int[] arr) {
        if(arr.length==1)
            return true;
        int i = 1;
        while (i<arr.length&&arr[i]>arr[i-1]){
            i++;
        }
        if(i==1||i==arr.length-1){
            return false;
        }

        while (i<arr.length&&arr[i]<arr[i-1]){
            i++;
        }
        if(i!=arr.length-1){
            return false;
        }else
            return true;
    }
}
