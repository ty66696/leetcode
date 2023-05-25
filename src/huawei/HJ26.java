package huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HJ26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        list.sort(Comparator.comparingInt(Character::toLowerCase));
        for (int i = 0,j=0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                sb.append(list.get(j));
                j++;
            }else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
