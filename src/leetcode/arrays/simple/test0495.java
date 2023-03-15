package leetcode.arrays.simple;

public class test0495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int k = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i]-timeSeries[i-1]>=duration){
                k=k+duration;
            }else {
                k=k+timeSeries[i]-timeSeries[i-1];
            }
        }
        return k+duration;
    }
}
