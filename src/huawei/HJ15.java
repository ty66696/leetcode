package huawei;

import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        String string = Integer.toBinaryString(i);
        int count =0;
        for (int j = 0; j < string.length(); j++) {
            if(string.charAt(j)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
