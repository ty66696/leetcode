package huawei;

import java.util.*;

public class HJ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String next1 = sc.next();
        next = next+next1;
        char[] chars = next.toCharArray();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(i%2==0)
                list1.add(chars[i]);
            else
                list2.add(chars[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        List<Character> list = new ArrayList<>();
        for (int i = 0,m=0,n=0; i < Math.max(list1.size(),list2.size()); i++) {
            if(m<list1.size())
                list.add(list1.get(m++));
            if(n<list2.size())
                list.add(list2.get(n++));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Character c = list.get(i);
            if((c>='0'&&c<='9')||(c>='a'&&c<='f')||(c>='A'&&c<='F')){
                int k = Integer.parseInt(list.get(i) + "", 16);
                String string = Integer.toBinaryString(k);
                while (string.length()<4){
                    string="0"+string;
                }
                StringBuilder sb = new StringBuilder(string);
                sb.reverse();
                int i1 = Integer.parseInt(sb.toString(),2);
                String s = Integer.toHexString(i1);
                s = s.toUpperCase();
                stringBuilder.append(s);
            }else {
                stringBuilder.append(c);
            }

        }
        System.out.println(stringBuilder);
    }
}
