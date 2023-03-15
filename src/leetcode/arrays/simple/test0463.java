package leetcode.arrays.simple;

public class test0463 {
    public int islandPerimeter(int[][] grid) {
        int index = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if(anInt==1)
                    index++;
            }
        }
        return index*4-(index-1)*2;
    }
}
