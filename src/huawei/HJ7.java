package huawei;

import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("\\.");
        int c = (int)split[1].charAt(0)-'0';
        int k = Integer.parseInt(split[0]);
        if(c<5){
            k=k + 1;
        }
        System.out.println(k);
    }
}
