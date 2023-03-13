package leetcode.strings.simple;

public class test0171 {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int c = columnTitle.charAt(i);
            int m = c - 'A'+1;
            sum = sum*26+m;
        }
        return sum;
    }
}
