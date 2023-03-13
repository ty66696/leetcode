package leetcode.strings.simple;

import javax.lang.model.util.ElementScanner6;

public class test1812 {
    public boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0) - 'a';
        if((i+Integer.parseInt(coordinates.charAt(1)+""))%2==1)
            return false;
        else
            return true;
    }
}
