package huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        StringBuilder sb2= new StringBuilder();
        sb.reverse();
        int[] num = new int[10];
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(num[c-'0']>0){
                sb2.append(c);
            }
            num[c-'0']=1;
        }
        System.out.println(sb2.toString());
    }
}
