package leetcode.strings.simple;

public class test1309 {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        char[] a = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String str = "";
        String[] split = s.split("#");
        for (int i = 0; i < split.length; i++) {
            if(i==split.length-1&&s.charAt(s.length()-1)!='#'){
                if(split[i].length()>0){
                    for (int i1 = 0; i1 < split[i].length(); i1++) {
                        str =str+a[split[i].charAt(i1)-'0'-1];
                    }
                }
                return str;
            }
            String split2 = split[i].substring(split[i].length()-2);
            String split1 = split[i].substring(0,split[i].length()-2);

            if(split1.length()>0){
                for (int i1 = 0; i1 < split1.length(); i1++) {
                    str =str+a[split1.charAt(i1)-'0'-1];
                }
            }
            int i1 = split2.charAt(0) - '0';
            int i2 = split2.charAt(1) - '0';
            int i3 = i1 * 10 + i2;
            str = str + a[i3 - 1];
        }
        return str;
    }
}
