package leetcode.strings.simple;

public class test1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        removeDuplicates(s);
    }
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(sb.length()==0)
                sb.append(s.charAt(i));
            else if(sb.charAt(sb.length()-1)==s.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
            }else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
