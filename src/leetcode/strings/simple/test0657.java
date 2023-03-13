package leetcode.strings.simple;

public class test0657 {
    public boolean judgeCircle(String moves) {
        int[] num = new int[4];
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c=='R'){
                num[0]++;
            }else if(c=='L'){
                num[1]++;
            }else if(c=='U'){
                num[2]++;
            }else {
                num[3]++;
            }
        }
        if(num[0]==num[1]&&num[2]==num[3])
            return true;
        return false;
    }
}
