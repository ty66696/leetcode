package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                sb.append(c);
            }else {
                if(sb.length()>0){
                    list.add(sb.toString());
                    sb.delete(0,sb.length());
                }
            }
        }
        list.add(sb.toString());
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if(i>0){
                System.out.print(" ");
            }
        }
    }
}
