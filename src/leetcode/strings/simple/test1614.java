package leetcode.strings.simple;

public class test1614 {
    public int maxDepth(String s) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                index++;
                if(index>max){
                    max = index;
                }
            }else if(c==')')
                index--;

        }
        return max;
    }
}
