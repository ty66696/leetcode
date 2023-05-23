package huawei;

import java.math.BigInteger;
import java.util.Scanner;

public class HJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 2; i*i <= s; i++) {
            while (s%i==0){
                System.out.print(i);
                System.out.print(" ");
                s=s/i;
                if(s==1)
                    return;
            }
        }
        System.out.print(s);
    }
}
