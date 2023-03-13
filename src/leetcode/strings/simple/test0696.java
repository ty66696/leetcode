package leetcode.strings.simple;

public class test0696 {
    public static void main(String[] args) {
        String s = "10101";
        System.out.println(countBinarySubstrings(s));
    }
    public static int countBinarySubstrings(String s) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for(int j = i;j<s.length();j++){
                str =str+s.charAt(j);
                if (str.length()%2==0){
                    String s1 = str.substring(0,str.length()/2);
                    String s2 = str.substring(str.length()/2);
                    if((!s1.contains("0")&&!s2.contains("1"))||(!s1.contains("1")&&!s2.contains("0"))){
                        index++;
                    }
                }

            }
        }
        return index;
    }
}
