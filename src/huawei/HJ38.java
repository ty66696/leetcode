package huawei;

import java.util.Scanner;

public class HJ38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double sum = 0;
        for (int j = 0; j < 5; j++) {
            sum =sum+ i +i/2;
            i=i/2;
        }
        System.out.println(sum-i);
        System.out.println(i);
    }
}

