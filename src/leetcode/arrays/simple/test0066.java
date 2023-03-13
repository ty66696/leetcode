package leetcode.arrays.simple;

public class test0066 {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        plusOne(num);
    }
    public static int[] plusOne(int[] digits) {
        int k=1;
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i]==9) {
                digits[i] = 0;
                k=1;
            }else {
                digits[i]=digits[i]+k;
                break;
            }
        }
        if(digits[0]==0){
            int[] num = new int[digits.length+1];
            for (int i = 0; i < digits.length; i++) {
                num[i+1] = digits[i];
            }
            num[0] =1;
            return num;
        }
        return digits;
    }
}
