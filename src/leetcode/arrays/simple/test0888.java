package leetcode.arrays.simple;

public class test0888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0, sum2 = 0;
        for (int aliceSize : aliceSizes) {
            sum1 = sum1 + aliceSize;
        }
        for (int bobSize : bobSizes) {
            sum2 = sum2 + bobSize;
        }
        int[] num = new int[2];
        if(sum1>sum2){
            int k = sum1 - sum2;
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if(aliceSizes[i]-bobSizes[j]==k/2){
                        num[0] = aliceSizes[i];
                        num[1] = bobSizes[j];
                    }
                }
            }
        }else{
            int k = sum2 - sum1;
            for (int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if(bobSizes[j]-aliceSizes[i]==k/2){
                        num[0] = aliceSizes[i];
                        num[1] = bobSizes[j];
                    }
                }
            }
        }
        return num;
    }
}
