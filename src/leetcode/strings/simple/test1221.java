package leetcode.strings.simple;

public class test1221 {
    public int balancedStringSplit(String s) {
        int index = 0;
        if (balance(s)){
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                str = str+s.charAt(i);
                if(balance(str)){
                    index ++;
                    str = "";
                }
            }
        }
        return index;
    }

    private boolean balance(String s) {
        int r=0,l=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R')
                r++;
            else
                l++;
        }
        if(r==l)
            return true;
        else
            return false;
    }

}
