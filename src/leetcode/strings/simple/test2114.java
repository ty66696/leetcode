package leetcode.strings.simple;

public class test2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String[] s = sentence.split(" ");
            if(s.length>max)
                max = s.length;
        }
        return max;
    }
}
