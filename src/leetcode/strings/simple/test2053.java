package leetcode.strings.simple;

import java.util.HashMap;

public class test2053 {
    public String kthDistinct(String[] arr, int k) {
        int[] num = new int[26];
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }else
                hm.put(s,1);
        }
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i])==1){
                m++;
                if(m==k){
                    return arr[i];
                }
            }
        }
        return "";
    }
}
