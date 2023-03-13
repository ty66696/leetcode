package leetcode.strings.simple;

public class test0500 {
    public static void main(String[] args) {
        String[] words = new String[]{"asdfghjkla","qwertyuiopq","zxcvbnzzm","asdfghjkla","qwertyuiopq","zxcvbnzzm"};
        String[] words1 = findWords(words);
        for (String s : words1) {
            System.out.println(s);
        }
    }
    public static String[] findWords(String[] words) {
        String[] str = new String[]{"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        String[]  str2 = new String[words.length];
        int j=0;
        s:for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = 0;
            for (int i1 = 0; i1 < 3; i1++) {
                if(str[i1].indexOf(word.charAt(0))!=-1){
                    index = i1;
                }
            }
            for (int i1 = 1; i1 < word.length(); i1++) {
                char c = word.charAt(i1);
                if(str[index].indexOf(c)==-1){
                    continue s;
                }
            }
            str2[j++] = word;
        }
        String[]  str3 = new String[j];
        for (int i = 0; i < str3.length; i++) {
            str3[i] = str2[i];
        }
        return str3;
    }
}
