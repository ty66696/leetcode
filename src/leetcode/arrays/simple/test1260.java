package leetcode.arrays.simple;

import java.util.ArrayList;
import java.util.List;

public class test1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k>0) {
            int temp = grid[grid.length - 1][grid[0].length - 1];
            for (int i = grid.length - 1; i >= 0; i--) {
                for (int j = grid[0].length - 1; j >= 0; j--) {
                    if (j == grid[0].length - 1 && i == grid.length - 1) {

                    } else if (j == grid[0].length - 1 && i != grid.length - 1) {
                        grid[i + 1][0] = grid[i][j];
                    } else {
                        grid[i][j + 1] = grid[i][j];
                    }
                }
            }
            grid[0][0] = temp;
            k--;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int[] ints : grid) {
            List<Integer> list1 = new ArrayList<>();
            for (int anInt : ints) {
                list1.add(anInt);
            }
            list.add(list1);
        }
        return list;
    }
}
