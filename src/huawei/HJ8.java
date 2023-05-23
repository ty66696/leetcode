package huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        sc.nextLine();
        for (int j = 0; j < i; j++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int index = Integer.parseInt(s1[0]);
            int value = Integer.parseInt(s1[1]);
            tm.put(index,tm.getOrDefault(index,0)+value);
        }
        Set<Map.Entry<Integer, Integer>> entries = tm.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.print(entry.getKey());
            System.out.print(" ");
            System.out.println(entry.getValue());
        }
    }
}
