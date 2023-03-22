package leetcode.arrays.simple;

public class test1013 {
    public boolean canThreePartsEqualSum(int[] arr) {

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        if(sum%3!=0)
            return false;
        int i = sum / 3;
        int k = 0;
        int m = 0;
        for (int j : arr) {
            m=m+j;
            if(m==i){
                k++;
                m=0;
            }
        }
        if(k!=3)
            return false;
        else
            return true;
    }
}
