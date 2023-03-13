package leetcode.strings.simple;

public class test1832 {
    public boolean checkIfPangram(String sentence) {
        int[] num = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            num[sentence.charAt(i)-'a'] ++;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]==0)
                return false;
        }
        return true;
    }
}
