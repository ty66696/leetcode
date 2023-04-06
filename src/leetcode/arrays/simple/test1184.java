package leetcode.arrays.simple;

import java.util.Map;

public class test1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        for (int i : distance) {
            sum=sum+i;
        }
        int k=0;
        if(start>destination){
            int temp = destination;
            destination = start;
            start = temp;
        }
        for(int i = start;i<destination;i++){
            k=k+distance[i];
        }
        return Math.min(k,sum-k);
    }
}
