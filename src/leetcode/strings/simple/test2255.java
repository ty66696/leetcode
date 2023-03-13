package leetcode.strings.simple;

public class test2255 {
    public int countPrefixes(String[] words, String s) {
        int sum=0;
        for (int i = 0; i < words.length; i++) {
            if(s.startsWith(words[i]))
                sum++;
        }
        return sum;
    }
}
