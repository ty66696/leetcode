package leetcode.strings.simple;

public class test0844 {
    public static void main(String[] args) {
        String s ="xywrrmp",t ="xywrrmu#p";
        backspaceCompare(s,t);
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='#'&&sb1.length()>0){
                sb1.deleteCharAt(sb1.length()-1);
            }else if(s.charAt(i)!='#')
                sb1.append(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)=='#'&&sb2.length()>0){
                sb2.deleteCharAt(sb2.length()-1);
            }else if(t.charAt(i)!='#')
                sb2.append(t.charAt(i));
        }
        if(sb1.toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}
