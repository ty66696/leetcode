package huawei;

import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        TreeMap<String,Integer> tm = new TreeMap<>();
        for (int j = i; j > 0; j--) {
            String s = sc.nextLine();
            tm.put(s,tm.getOrDefault(s,0)+1);
        }
        Set<Map.Entry<String, Integer>> entries = tm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            for (int j = 0; j < value; j++) {
                System.out.println(entry.getKey());
            }
        }
    }
}
