package huawei;

import java.util.Scanner;

public class HJ36 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String str2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!str2.contains(c+"")){
                str2=str2+c;
                str = str.replace(c+"","");
            }
        }
        str2=str2+str;
        StringBuilder sb = new StringBuilder();
        char[] chars = str2.toCharArray();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            sb.append(chars[c-'a']);
        }
        System.out.println(sb);
    }
}
