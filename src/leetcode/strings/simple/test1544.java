package leetcode.strings.simple;

public class test1544 {
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        while (true) {
            boolean flag = false;
            String str ="";
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z'&&(s.charAt(i)+"").equalsIgnoreCase(s.charAt(i + 1)+""))
                        || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z'&&(s.charAt(i)+"").equalsIgnoreCase(s.charAt(i + 1)+""))) {
                    flag = true;
                    str = str + s.charAt(i) + s.charAt(i + 1);
                    s = s.replaceFirst(str, "");
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return s;
    }
}
