package leetcode.strings.simple;

public class test2108 {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString()))
                return word;
        }
        return "";
    }
}
