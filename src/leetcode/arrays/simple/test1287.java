package leetcode.arrays.simple;

public class test1287 {
    public int findSpecialInteger(int[] arr) {
        int index = 1;
        if(arr.length==1)
            return arr[0];
        int num = arr.length/4+1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1])
                index++;
            else
                index=1;
            if(index>=num)
                return arr[i];
        }
        return 0;
    }
}
