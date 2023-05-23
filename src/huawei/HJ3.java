package huawei;

import java.util.Scanner;
import java.util.TreeSet;

public class HJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int j = 0; j < i; j++) {
            int k = sc.nextInt();
            ts.add(k);
        }
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
