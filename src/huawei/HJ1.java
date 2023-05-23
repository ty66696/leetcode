package huawei;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        String s1 = s[s.length - 1];
        System.out.println(s1.length());
    }
}
