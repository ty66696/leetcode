package leetcode.arrays.simple;

import java.util.HashMap;

public class test0860 {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        test0860.lemonadeChange(bills);
    }
    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(5,0);
        hm.put(10,0);
        hm.put(20,0);
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5){
                hm.put(5,hm.get(5)+1);
            }else if(bills[i]==10){
                hm.put(10,hm.get(10)+1);
                if(hm.get(5)<1)
                    return false;
                hm.put(5,hm.get(5)-1);
            }else {
                if((hm.get(10)<1||hm.get(5)<1)&&hm.get(5)<3){
                    return false;
                }
                if(hm.get(10)>=1){
                    hm.put(10,hm.get(10)-1);
                    hm.put(5,hm.get(5)-1);
                }else {
                    hm.put(5,hm.get(5)-3);
                }
            }
        }
        return true;
    }
}
