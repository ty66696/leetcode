package leetcode.strings.simple;

public class test0557 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String s1 = str[i];
            StringBuilder sb = new StringBuilder(s1);
            if(i==str.length-1){
                stringBuilder.append(sb.reverse());
                break;
            }
            stringBuilder.append(sb.reverse()).append(" ");

        }
        return stringBuilder.toString();
    }
}
