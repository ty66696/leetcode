package leetcode.arrays.simple;

public class test1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int index  = 0;
        for (int i = 0; i < arr.length-2; i++) {
            int x = arr[i];
            for(int j = i+1;j<arr.length-1;j++){
                int y = arr[j];
                if(Math.abs(x-y)<=a){
                    for(int k = j+1;k<arr.length;k++){
                        int z = arr[k];
                        if(Math.abs(y-z)<=b&&Math.abs(x-z)<=c){
                            index++;
                        }
                    }
                }
            }
        }
        return index;
    }
}
