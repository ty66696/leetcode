package leetcode.strings.simple;

public class test1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<Math.min(word1.length(),word2.length())){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(word1.length()>word2.length()){
            sb.append(word1.substring(i));
        }else if(word2.length()>word1.length())
            sb.append(word2.substring(i));
        return sb.toString();
    }
}
