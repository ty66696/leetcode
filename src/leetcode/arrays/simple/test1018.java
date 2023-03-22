package leetcode.arrays.simple;

import java.lang.annotation.ElementType;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;

public class test1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        String s = "";
        for (int num : nums) {
            s= s+num;
            Long i = Long.parseLong(s, 2);
            if(i%5==0)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
