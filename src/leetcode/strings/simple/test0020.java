package leetcode.strings.simple;

public class test0020 {
    public boolean isValid(String s) {
        int len = s.length();
        do {
            len = s.length();
            s = s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        } while (s.length() != len);
        if(s!="")
            return false;
        return true;
    }
}
