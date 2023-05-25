package huawei;

import java.util.Scanner;

public class HJ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
        'q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                char aChar = chars[(c - 'a'+1)%26];
                sb.append(aChar);
            }else if(Character.isLowerCase(c)){
                if(c>='a'&&c<='r'){
                    int k = (c-'a')/3+2;
                    sb.append(k);
                }else if(c=='s') {
                    sb.append(7);
                }else if(c>='t'&&c<='y'){
                    int k = (c-'a'-1)/3+2;
                    sb.append(k);
                }else if(c=='z')
                    sb.append(9);
            }else
                sb.append(c);
        }
        System.out.println(sb);
    }
}
