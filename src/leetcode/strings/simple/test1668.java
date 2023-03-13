package leetcode.strings.simple;

public class test1668 {
    public static void main(String[] args) {
        String s1 ="aaabaaaabaaabaaaabaaaabaaaabaaaaba",s2 ="aaaba";
        System.out.println(maxRepeating(s1, s2));
    }
    public static int maxRepeating(String sequence, String word) {
        String s = "";
        int i = 0;
        while(true){
            s =s+word;
            if(sequence.contains(s)){
                i++;
            }else
                break;
        }
        return i;
    }
}
