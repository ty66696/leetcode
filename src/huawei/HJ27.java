package huawei;

import java.util.*;

public class HJ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i1 = 0; i1 < i; i1++) {
            String s = sc.next();
            list.add(s);
        }
        String s1 = sc.next();
        int[] num = new int[26];
        for (int j = 0; j < s1.length(); j++) {
            char c = s1.charAt(j);
            num[c-'a']++;
        }
        int k = sc.nextInt();
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            int[] ints = Arrays.copyOf(num, num.length);
            if(s.length()!=s1.length()){
                continue;
            }
            if(s.equals(s1)){
                continue;
            }
            if(isBro(ints,s)){
                list2.add(s);
            }
        }
        Collections.sort(list2);
        System.out.println(list2.size());
        if(k-1<=list2.size())
            System.out.println(list2.get(k-1));
    }
    public static boolean isBro(int[] num,String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c-'a']--;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0){
                return false;
            }
        }
        return true;
    }
}
