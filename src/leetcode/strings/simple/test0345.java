package leetcode.strings.simple;

public class test0345 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }
    public static String reverseVowels(String s) {
        String str = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length-1;i<j;) {
            while (!str.contains(chars[i]+"")){
                i++;
                if(i>chars.length-1)
                    return s;
            }
            if(i>j)
                break;
            while (!str.contains(chars[j]+"")){
                j--;
            }

            char temp;
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
