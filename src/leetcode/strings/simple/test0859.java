package leetcode.strings.simple;

public class test0859 {
    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        buddyStrings(s,goal);
    }
    /**
     * 长度不同
     * 长度相同 字符串相等 有重复
     * 长度相同 字符串相等 没有重复
     * 长度相同 字符串不相等
     * @param s
     * @param goal
     * @return
     */
    public static boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        if(s.equals(goal)){
            if(sameWord(s))
                return true;
            else
                return false;
        }else {
            int index = 0,n=0;
            int[] m =new int[2];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                char c1 = goal.charAt(i);
                if(c!=c1){
                    if (n<2)
                        m[n++]=i;
                    index++;
                }
            }
            if(index==2){
                char temp1 ,temp2;
                temp1 = s.charAt(m[0]);
                temp2 = s.charAt(m[1]);
                StringBuilder sb1=new StringBuilder(s);
                sb1.setCharAt(m[0],temp2);
                sb1.setCharAt(m[1],temp1);
                if(sb1.toString().equals(goal))
                    return true;
                else
                    return false;
            }
            else if(index>2)
                return false;
            else
                return true;
        }
    }

    public static boolean sameWord(String s) {
        int[] str = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int i1 = s.charAt(i) - 'a';
            str[i1] = str[i1]+1;
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i]>2)
                return true;
        }
        return false;
    }

}
