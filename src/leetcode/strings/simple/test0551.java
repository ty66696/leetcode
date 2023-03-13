package leetcode.strings.simple;

public class test0551 {
    public boolean checkRecord(String s) {
        if(s.contains("LLL"))
            return false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='A'){
                count++;
                if(count==2)
                    return false;
            }
        }
        return true;
    }
}
