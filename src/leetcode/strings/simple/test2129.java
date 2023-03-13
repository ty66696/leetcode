package leetcode.strings.simple;

import com.sun.xml.internal.ws.util.StringUtils;

public class test2129 {
    public String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            if(s1.length()<=2) {
                s[i] = s1.toLowerCase();
            }else {
                String s2 = s1.substring(0, 1).toUpperCase();
                String s3 = s1.substring(1).toLowerCase();
                s[i]=s2+s3;
            }
        }
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if(i==s.length-1) {
                str = str + s[i];
                break;
            }
            str =str+s[i]+" ";
        }
        return str;
    }
}
