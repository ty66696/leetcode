package leetcode.strings.simple;

public class test1160 {
    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        countCharacters(words,chars);
    }
    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = 0;
            int[] num = new int[26];
            boolean flag = true;
            for (int i1 = 0; i1 < word.length(); i1++) {
                char c = word.charAt(i1);
                num[c-'a'] = chars.indexOf(c,num[c-'a'])+1;
                if(num[c-'a']==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum=sum+word.length();
            }
        }
        return sum;
    }
}
