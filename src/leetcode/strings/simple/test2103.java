package leetcode.strings.simple;

public class test2103 {
    public int countPoints(String rings) {
        int[] a = new int[10];
        int value, res = 0;
        int len = rings.length();
        for(int i = 0; i < len; i += 2){
            if(rings.charAt(i) == 'R'){
                a[rings.charAt(i+1) - '0'] |= 1;
            }else if(rings.charAt(i) == 'G'){
                a[rings.charAt(i+1) - '0'] |= 2;
            }else{
                a[rings.charAt(i+1) - '0'] |= 4;
            }
            if(a[rings.charAt(i+1) - '0'] == 7){
                a[rings.charAt(i+1) - '0'] |= 8;
                ++res;
            }
        }
        return res;
    }
}
