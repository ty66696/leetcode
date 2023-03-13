package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test2194 {
    public static void main(String[] args) {
        String s = "K1:L2";
        System.out.println(cellsInRange(s));
    }
    public static List<String> cellsInRange(String s) {
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        char k1 = s.charAt(1);
        char k2 = s.charAt(4);
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= c2-c1; i++) {
            for(int j = 0;j<=k2-k1;j++){
                char c = (char) (c1 + i);
                char v = (char) (k1 + j);
                StringBuilder sb =new StringBuilder();
                sb.append(c).append(v);
                list.add(sb.toString());
            }
        }
        return list;
    }
}
