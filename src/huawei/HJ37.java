package huawei;

import java.util.Scanner;

public class HJ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return  f(n-1)+f(n-2);
    }
}

