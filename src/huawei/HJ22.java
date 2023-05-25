package huawei;

import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int i = sc.nextInt();
            if(i==0)
                break;
            System.out.println(i/2);
        }
    }
}
