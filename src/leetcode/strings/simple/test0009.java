package leetcode.strings.simple;

public class test0009 {
        public static void main(String []args) {
            System.out.println(isPalindrome(-121));
        }
        public static boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int sum = 0;
            int temp = x;
            while(x!=0){
                int i = x%10;
                sum = sum*10+i;
                x= x/10;
            }
            if(temp!=sum){
                return false;
            }
            else{
                return true;
            }
        }
}
