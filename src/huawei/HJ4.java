package huawei;

import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()%8==0){
            int k = 0;
            for (int i = 0; i < s.length(); i=i+8) {
                String substring = s.substring(i, i + 8);
                System.out.println(substring);
            }
        }else {
            int k = s.length() % 8;
            for (int i = 0; i < 8 - k; i++) {
                s=s+"0";
            }
            for (int i = 0; i < s.length(); i=i+8) {
                String substring = s.substring(i, i + 8);
                System.out.println(substring);
            }
        }
    }
}
