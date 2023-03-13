package leetcode.strings.simple;

public class test2515 {
    public int closetTarget(String[] words, String target, int startIndex) {
        int i=0,j=0;
        boolean flag = false;
        for (i = 0; i < words.length; i++) {
            if(words[(i+startIndex)%words.length].equals(target)){
                flag = true;
                break;
            }
        }
        for (j = 0; j < words.length; j++) {
            if(words[(startIndex-j+ words.length)%words.length].equals(target)){
                flag = true;
                break;
            }
        }
        if(flag)
            return Math.min(i,j);
        else
            return -1;
    }
}
