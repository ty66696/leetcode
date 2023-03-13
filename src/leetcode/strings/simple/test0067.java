package leetcode.strings.simple;

public class test0067 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String s = addBinary(a, b);
    }
    public static String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String c = a;
            a = b;
            b = c;
        }
        StringBuilder sb1 = new StringBuilder(a);
        sb1 = sb1.reverse();
        StringBuilder sb2 = new StringBuilder(b);
        sb2 = sb2.reverse();
        sb1 = sb1.append(0);
        for(int i = sb2.length();i<=sb1.length()-1;i++){
            sb2.append(0);
        }
        String str1 = sb1.toString();
        String str2 = sb2.toString();
        char[] charA = str1.toCharArray();
        char[] charB = str2.toCharArray();
        int[] charC = new int[charA.length];
        int p = 0;
        for (int i = 0; i < sb1.length(); i++) {
            int x = Integer.parseInt(String.valueOf(charA[i]));
            int y = Integer.parseInt(String.valueOf(charB[i]));
            int sum = (x + y + p)%2;
            p = (p+x+y)/2;
            charC[i] = sum;
        }
        String s = "";
        StringBuilder sb = new StringBuilder();
        if(charC[charC.length-1] == 0){
            for (int i = 0; i < charC.length-1; i++) {
                sb.append(charC[i]);
            }
            return sb.reverse().toString();
        }else {
            for (int i = 0; i < charC.length; i++) {
                sb.append(charC[i]);
            }
            return sb.reverse().toString();
        }
    }
}
