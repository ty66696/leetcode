package leetcode.arrays.simple;

public class test1304 {
    public int[] sumZero(int n) {
        int[] num  =new int[n];
        if(n%2==0){
            int k=n;
            for (int i = 0; i < n/2; i++) {
                num[i] = k/2;
                num[n-i-1] = -k/2;
                k=k-2;
            }
        }else {
            int k=n;
            for (int i = 0; i < n/2; i++) {
                num[i] = k/2;
                num[n-i-1] = -k/2;
                k=k-2;
            }
            num[n/2]=0;
        }
        return num;
    }
}
