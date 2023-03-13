package leetcode.strings.simple;

public class test0013 {

    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }

    public static int romanToInt(String s) {
        int num = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            char aChar = chars[i];
            char aChar1 = chars[i + 1];
            if (aChar == 'I' && aChar1 == 'V') {
                num = num + 4;
                i++;
            } else if (aChar == 'I' && aChar1 == 'X') {
                num = num + 9;
                i++;
            } else if (aChar == 'X' && aChar1 == 'L') {
                num = num + 40;
                i++;
            } else if (aChar == 'X' && aChar1 == 'C') {
                num = num + 90;
                i++;
            } else if (aChar == 'C' && aChar1 == 'D') {
                num = num + 400;
                i++;
            } else if (aChar == 'C' && aChar1 == 'M') {
                num = num + 900;
                i++;
            } else {
                if (aChar == 'I') {
                    num = num + 1;
                } else if (aChar == 'V') {
                    num = num + 5;
                } else if (aChar == 'X') {
                    num = num + 10;
                } else if (aChar == 'L') {
                    num = num + 50;
                } else if (aChar == 'C') {
                    num = num + 100;
                } else if ((aChar == 'D')) {
                    num = num + 500;
                } else {
                    num = num + 1000;
                }
            }
            if(i==chars.length-1){
                return num;
            }
        }
        char aChar1 = chars[chars.length - 1];
        if (aChar1 == 'I') {
            num = num + 1;
        } else if (aChar1 == 'V') {
            num = num + 5;
        } else if (aChar1 == 'X') {
            num = num + 10;
        } else if (aChar1 == 'L') {
            num = num + 50;
        } else if (aChar1 == 'C') {
            num = num + 100;
        } else if ((aChar1 == 'D')) {
            num = num + 500;
        } else {
            num = num + 1000;
        }

        return num;
    }

}
