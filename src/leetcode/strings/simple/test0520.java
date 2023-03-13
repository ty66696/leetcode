package leetcode.strings.simple;

public class test0520 {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().toLowerCase().equals(word)){
            return true;
        }else if(word.toLowerCase().toUpperCase().equals(word)){
            return true;
        }else if(word.substring(1).toUpperCase().toLowerCase().equals(word.substring(1))){
            return true;
        }else
            return false;
    }

}
