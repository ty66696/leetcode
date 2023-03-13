package leetcode.strings.simple;

public class test2287 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode", target = "code";
        rearrangeCharacters(s,target);
    }
    public static int rearrangeCharacters(String s, String target) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c-'a']++;
        }
        int[] num2 = new int[26];
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            num2[c-'a']++;
        }
        int min = 1000;
        for (int i = 0; i < num2.length; i++) {
            if(num2[i]!=0){
                int j = num[i] / num2[i];
                if(j<min)
                    min=j;
            }
        }
        return min;
    }
}
