package leetcode.strings.simple;

public class test2000 {
    public String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==ch) {
                String word1 = word.substring(0, i + 1);
                StringBuilder sb = new StringBuilder(word1);
                word1 = sb.reverse().toString();
                String word2 = word.substring(i+1);
                word = word1+word2;
                break;
            }
        }
        return word;
    }
}
