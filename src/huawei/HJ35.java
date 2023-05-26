package huawei;

import java.util.Scanner;

public class HJ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int m = 0;
            for (int j = 1; j <= k - i+1; j++) {
                if(j==1){
                    System.out.print(num(i)+" ");
                    m = num(i);
                }else {
                    System.out.print(m+i+j-1+" ");
                    m=m+i+j-1;
                }
            }
            System.out.println();
        }
    }
    public static int num(int i){
        int k = 0;
        for (int j = 0; j < i; j++) {
            k=k+j;
        }
        return k+1;
    }
}
