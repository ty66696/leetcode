package leetcode.strings.simple;

public class test2124 {
    public boolean checkString(String s) {
        if(s.lastIndexOf('a')<0)
            return true;
        int index = s.lastIndexOf('a');
        String substring = s.substring(0, index);
        if(substring.contains("b"))
            return false;
        else
            return true;
    }
}
