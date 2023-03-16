package leetcode.arrays.simple;

public class test0744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char c = letters[0];
        for (char letter : letters) {
            if(letter>target&&(letter-target)<min){
                min = letter-target;
                c = letter;
            }
        }
        return c;
    }
}
