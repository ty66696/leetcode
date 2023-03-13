package leetcode.strings.simple;

import java.util.List;

public class test1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if(ruleKey.equals("type"))
            index = 0;
        else if(ruleKey.equals("color"))
            index = 1;
        else
            index = 2;
        int i = 0;
        for (List<String> item : items) {
            if(item.get(index).equals(ruleValue))
                i++;
        }
        return i;
    }
}
