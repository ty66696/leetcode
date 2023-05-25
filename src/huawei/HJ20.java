package huawei;

import java.util.Scanner;

public class HJ20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        s:while (sc.hasNext()){
            String s = sc.nextLine();
            if(s.length()<=8){
                System.out.println("NG");
                continue;
            }
            int[] num = new int[4];
            for (int i = 0; i < s.length(); i++) {
                if(Character.isLowerCase(s.charAt(i)))
                    num[0]++;
                else if(Character.isUpperCase(s.charAt(i)))
                    num[1]++;
                else if(Character.isDigit(s.charAt(i)))
                    num[2]++;
                else
                    num[3]++;
            }
            int count=0;
            for (int i = 0; i < num.length; i++) {
                if(num[i]>0)
                    count++;
            }
            if(count<3) {
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i+3 < s.length(); i++) {
                String substring = s.substring(i, i + 3);
                String replace = s.replace(substring, "");
                if(s.length()-replace.length()>3){
                    System.out.println("NG");
                    continue s;
                }
            }
            System.out.println("OK");
        }
    }
}
