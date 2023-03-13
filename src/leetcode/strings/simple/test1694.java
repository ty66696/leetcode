package leetcode.strings.simple;

public class test1694 {
    public static void main(String[] args) {
        String number = "1-23-45 6";
        reformatNumber(number);
    }
    public static String reformatNumber(String number) {
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i)!=' '&&number.charAt(i)!='-')
                str = str+number.charAt(i);
        }
        if(str.length()<=3)
            return str;
        String s1,s2="",s3="";
        if(str.length()%3==1){
            s1 = str.substring(0,str.length()-4);
            s2 = str.substring(str.length()-4);
            s3=s3+s2.charAt(0)+s2.charAt(1)+"-"+s2.charAt(2)+s2.charAt(3);
            s2 =s3;
        }else if(str.length()%3==2){
            s1 = str.substring(0,str.length()-2);
            s2 = str.substring(str.length()-2);
        }else
            s1 =str;
        String s ="";
        for (int i = 0; i < s1.length(); i++) {
            s = s+s1.charAt(i);
            if(i<s1.length()-1){
                if((i+1)%3==0){
                    s=s+"-";
                }
            }
        }
        if(!s2.equals("")){
            s=s+"-"+s2;
        }else if(s1.equals(""))
            s=s2;
        return s;
    }
}
