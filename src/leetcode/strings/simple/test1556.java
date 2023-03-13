package leetcode.strings.simple;

public class test1556 {
    public static void main(String[] args) {
        int n =123456789;
        System.out.println(thousandSeparator(n));
    }
    public static String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder(n+"");
        sb.reverse();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if(i==sb.length()-1){
                sb2.append(sb.charAt(i));
                break;
            }
            sb2.append(sb.charAt(i));
            if((i+1)%3==0){
                sb2.append(".");
            }
        }
        return sb2.reverse().toString();
    }
}
