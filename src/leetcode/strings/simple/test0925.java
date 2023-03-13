package leetcode.strings.simple;

import java.nio.charset.StandardCharsets;

public class test0925 {
    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        isLongPressedName(name, typed);
    }

    /**
     * 一起结束 true
     * name先结束 type后面都一致
     * type先结束 返回错
     *
     * @param name
     * @param typed
     * @return
     */
    public static boolean isLongPressedName(String name, String typed) {
        for (int i = 0, j = 0; i < name.length() && j < typed.length(); ) {
            if (name.charAt(i) != typed.charAt(j))
                return false;
            while (i <= name.length() - 1 && j <= typed.length() - 1 && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            if (j == typed.length() && i <= name.length() - 1)
                return false;
            else if (i == name.length() && j <= typed.length() - 1) {
                while (j <= typed.length() - 1) {
                    if (typed.charAt(j) != typed.charAt(j - 1))
                        return false;
                    j++;
                }
                return true;
            } else if (j == typed.length() && i == name.length()) {
                return true;
            } else {
                while (j <= typed.length() - 1) {
                    if (typed.charAt(j) == typed.charAt(j - 1)) {
                        j++;
                    }else
                        break;
                }
                if (j == typed.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
