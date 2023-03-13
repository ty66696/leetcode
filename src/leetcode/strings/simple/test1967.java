package leetcode.strings.simple;

public class test1967 {
    public int numOfStrings(String[] patterns, String word) {
        int sum=0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            if(word.contains(pattern))
                sum++;
        }
        return sum;
    }
}
