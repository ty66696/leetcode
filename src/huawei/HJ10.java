package huawei;

import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        int[] num = new int[127];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if(num[c]==0){
                count++;
                num[c]++;
            }
        }
        System.out.println(count);
    }
}
