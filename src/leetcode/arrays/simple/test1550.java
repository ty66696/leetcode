package leetcode.arrays.simple;

public class test1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
                if (count == 3)
                    return true;
            } else {
                count = 0;
            }
        }
        return false;
    }
}
