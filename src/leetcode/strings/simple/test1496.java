package leetcode.strings.simple;

import java.util.HashSet;

public class test1496 {
    public static void main(String[] args) {
        String path = "NES";
        System.out.println(isPathCrossing(path));
    }
    public static boolean isPathCrossing(String path) {
        int m=0,n=0;
        HashSet<String> hs = new HashSet<>();
        String s = "";
        s= m+","+n;
        hs.add(s);
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            switch (c){
                case 'N': n++;break;
                case 'S':n--;break;
                case 'E':m++;break;
                case 'W':m--;break;
            }
            String str = "";
            str = m+","+n;
            if(!hs.add(str)){
                return true;
            }
        }
        return false;
    }
}
