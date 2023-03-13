package leetcode.strings.simple;

public class test2259 {
    public static void main(String[] args) {
        String number = "11";
        char digit = '1';
        removeDigit(number,digit);
    }
    public static String removeDigit(String number, char digit) {
        int index = 0;
        while (number.indexOf(digit, index)>=0) {
            index = number.indexOf(digit, index);
            if ((index<number.length()-1&&number.charAt(index+1) > digit)||(index == number.lastIndexOf(digit))) {
                number = number.substring(0, index) + number.substring(index + 1);
                break;
            }
            index++;
        }
        return number;
    }
}
