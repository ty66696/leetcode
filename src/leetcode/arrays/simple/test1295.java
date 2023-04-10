package leetcode.arrays.simple;

public class test1295 {
    public int findNumbers(int[] nums) {
        int sum=0;
        for (int num : nums) {
            if(String.valueOf(num).length()%2==0)
                sum++;
        }
        return sum;
    }
}
