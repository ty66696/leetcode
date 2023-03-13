package leetcode.strings.simple;

public class test1880 {
    public static void main(String[] args) {
        String firstWord = "j", secondWord = "j", targetWord = "bi";
        isSumEqual(firstWord,secondWord,targetWord);
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1=0,sum2=0,sum3=0;
        for (int i = 0; i < firstWord.length(); i++) {
            int i1 = firstWord.charAt(i) - 'a';
            sum1=sum1*10+i1;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            int i1 = secondWord.charAt(i) - 'a';
            sum2=sum2*10+i1;
        }
        for (int i = 0; i < targetWord.length(); i++) {
            int i1 = targetWord.charAt(i) - 'a';
            sum3=sum3*10+i1;
        }
        if(sum1+sum2==sum3)
            return true;
        else
            return false;
    }
}
