package leetcode.strings.simple;

public class test1961 {
    public boolean isPrefixString(String s, String[] words) {
        int len=0;
        String str ="";
        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            str=str+words[i];
            len=len+length;
            if(len==s.length()){
                if(str.equals(s))
                    return true;
            }else if(len>s.length())
                break;
        }
        return false;
    }
}
