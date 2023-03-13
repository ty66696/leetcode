package leetcode.strings.simple;

public class test1784 {
    public boolean checkOnesSegment(String s) {
        int index1 = s.indexOf('1');
        int index2 = s.lastIndexOf('1');
        String str = s.substring(index1,index2+1);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='1')
                return false;
        }
        return true;
    }
}
