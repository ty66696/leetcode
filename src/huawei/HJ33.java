package huawei;

import java.util.Scanner;

public class HJ33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] split = s1.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String s = Integer.toBinaryString(Integer.parseInt(split[i]));
            while (s.length()<8){
                s="0"+s;
            }
            sb.append(s);
        }
        Long i = Long.parseLong(sb.toString(), 2);

        String string = Long.toBinaryString(Long.parseLong(s2));
        while (string.length()<32){
            string="0"+string;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i1 = 0; i1 < string.length(); i1=i1+8) {
            String substring = string.substring(i1, i1 + 8);
            int i2 = Integer.parseInt(substring, 2);
            sb2.append(i2);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length()-1);
        System.out.println(i);
        System.out.println(sb2);
    }
}
