package leetcode.strings.simple;

public class test2042 {
    public static void main(String[] args) {
        String s ="1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        areNumbersAscending(s);
    }
    public static boolean areNumbersAscending(String s) {
        s = s.replaceAll("[A-Za-z]", "");
        String[] s1 = s.trim().split("\\s+");
        for (int i = 1; i < s1.length; i++) {
            if(Integer.parseInt(s1[i])<Integer.parseInt(s1[i-1])){
                return false;
            }
        }
        return true;
    }
}
