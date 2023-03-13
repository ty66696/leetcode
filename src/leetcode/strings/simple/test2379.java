package leetcode.strings.simple;

public class test2379 {
    public static void main(String[] args) {
        String blocks = "WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW";
        int k =15;
        minimumRecolors(blocks,k);
    }
    public static int minimumRecolors(String blocks, int k) {
        int min = 1000;
        for (int i = 0; i < blocks.length() - k+1; i ++) {
            String s = blocks.substring(i, i + k);
            int jishu = jishu(s);
            if (jishu < min)
                min = jishu;
        }
        return min;
    }

    public static int jishu(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W')
                sum++;
        }
        return sum;
    }
}
