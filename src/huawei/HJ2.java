package huawei;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        int length = s.length();
        s = s.toLowerCase();
        s1=s1.toLowerCase();
        String replace = s.replace(s1, "");
        int length1 = replace.length();
        System.out.println(length-length1);
    }
}
