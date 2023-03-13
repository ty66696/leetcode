package leetcode.strings.simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2299 {
    public static void main(String[] args) {
        String password ="-Aa1a1a1";
        strongPasswordCheckerII(password);
    }
    public static boolean strongPasswordCheckerII(String password) {
        int da=0,xiao=0,shu=0,te=0;
        String reg = "!@#$%^&*()-+";
        if(password.length()<8)
            return false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c))
                da++;
            else if(Character.isLowerCase(c))
                xiao++;
            else if(Character.isDigit(c))
                shu++;
            else if(reg.contains(c+""))
                te++;
            if(i>=1){
                if(password.charAt(i)==password.charAt(i-1))
                    return false;
            }
        }
        if(da<1||xiao<1||shu<1||te<1)
            return false;
        else
            return true;
    }
}
