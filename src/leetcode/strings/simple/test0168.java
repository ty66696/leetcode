package leetcode.strings.simple;

public class test0168 {
    public static void main(String[] args) {
        int columnNumber = 52;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        char[] num = new char[]{ 'Z','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
        String s = "";

        while (columnNumber > 0) {
            int i = columnNumber % 26;
            char c = num[i];
            if(i==0) {
                columnNumber = columnNumber - 26;
            }
            columnNumber = columnNumber / 26;
            s = c + s;
        }
        return s;
    }
}
