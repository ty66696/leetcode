package huawei;

import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(2);
        int i = Integer.parseInt(s, 16);
        System.out.println(i);

    }
}
