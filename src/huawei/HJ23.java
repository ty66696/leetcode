package huawei;

import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        int[] num = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c-'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            if(i<min&&i>0){
                min = i;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]==min){
                char c = (char) ('a' + i);
                s = s.replace(c + "", "");
            }
        }
        System.out.println(s);
    }
}
