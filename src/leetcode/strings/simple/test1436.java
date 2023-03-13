package leetcode.strings.simple;

import java.util.List;

public class test1436 {
    public String destCity(List<List<String>> paths) {
        for (int i = 0; i < paths.size(); i++) {
            List<String> list = paths.get(i);
            String s = list.get(list.size() - 1);
            boolean flag = true;
            for (int i1 = 0; i1 < paths.size(); i1++) {
                List<String> list1 = paths.get(i);
                if(list1.get(0).equals(s)){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return s;
        }
        return "";
    }
}
