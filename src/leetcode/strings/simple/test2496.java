package leetcode.strings.simple;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2496 {
    public int maximumValue(String[] strs) {
        Pattern pattern =Pattern.compile("[0-9]*");
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if(pattern.matcher(str).matches()){
                int m = Integer.parseInt(str);
                if(max<m)
                    max = m;
            }else {
                int m =str.length();
                if(max<m)
                    max = m;
            }
        }
        return max;
    }
}
