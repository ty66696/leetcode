package leetcode.strings.simple;

public class test1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int length = s.length;
        for (int i = 0; i < s.length; i++) {
            for (int i1 = 0; i1 < s[i].length(); i1++) {
                if(brokenLetters.contains(s[i].charAt(i1)+"")){
                    length--;
                    break;
                }
            }
        }
        return length;
    }
}
