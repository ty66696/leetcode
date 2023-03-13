package leetcode.strings.simple;

public class test1446 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxPower(s));
    }
    public static int maxPower(String s) {
        int max = 1;
        char c = s.charAt(0);
        int index = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)!=c){
                if(index>max){
                    max = index;
                }
                c=s.charAt(i);
                index = 1;
            }else {
                index++;
            }
        }
        return max;
    }
}
