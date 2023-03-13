package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test1417 {
    public String reformat(String s) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                list1.add(s.charAt(i)+"");
            }else
                list2.add(s.charAt(i)+"");
        }
        int i=0;
        if(list1.size()<list2.size()){
            List<String> list3 = new ArrayList<>();
            list3 = list2;
            list2=list1;
            list1=list3;
        }
        if(list1.size()-list2.size()>1)
            return "";
        while(i<=list2.size()-1){
            String s1 = list1.get(i);
            sb.append(s1);
            String s2 = list2.get(i);
            sb.append(s2);
            i++;
        }
        if(i==list1.size()-2)
            sb.append(list1.get(i+1));
        return sb.toString();
    }
}
