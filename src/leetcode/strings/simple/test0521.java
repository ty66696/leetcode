package leetcode.strings.simple;

public class test0521 {
    public static void main(String[] args) {
        String a = "a", b = "aaa";
        System.out.println(findLUSlength(a, b));
    }
    public static int findLUSlength(String a, String b) {
        String s = "";
        if(a.length()<b.length()){
            String temp;
            temp = a;
            a = b;
            b = temp;
        }
        int length = 0;
        for (int i = 0; i < a.length(); i++) {
            s = "";
            for (int j = i; j < a.length(); j++) {
                s = s+ a.charAt(j);
                if(!b.contains(s)&&s.length()>length){
                    length = s.length();
                    if(length==a.length())
                        return length;
                }
            }
        }
        if(length!=0)
            return length;
        else
            return -1;
    }
}
