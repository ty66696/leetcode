package leetcode.strings.simple;

public class test0944 {
    public int minDeletionSize(String[] strs) {
        int length = strs[0].length();
        int index =0;
        for (int i1 = 0; i1 < length; i1++) {
            for (int i = 0; i < strs.length-1; i++) {
                if(strs[i].charAt(i1)>strs[i+1].charAt(i1)){
                    index++;
                    break;
                }

            }
        }
        return index;
    }
}
