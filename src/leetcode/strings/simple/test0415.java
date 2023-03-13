package leetcode.strings.simple;

public class test0415 {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int length = Math.max(num1.length(), num2.length());
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1.reverse();
        sb2.reverse();
        int p = 0;
        for (int i = 0;i<length;i++) {
            int c1 = (i <= sb1.length()-1 ? sb1.charAt(i)-'0' : 0);
            int c2 = (i <= sb2.length() - 1 ? sb2.charAt(i)-'0' : 0);
            int temp = 0;
            temp = (c1 + c2 +p) % 10;
            p = (c1 + c2 +p) / 10;
            sb.append(temp);
        }
        String s = sb.reverse().toString();
        if(s.charAt(0)=='0')
            s = s.substring(1);
        return s;
    }
}
