package leetcode.strings.simple;

public class test2437 {
    public static void main(String[] args) {
        String time ="2?:??";
        countTime(time);
    }
    public static int countTime(String time) {
        int a=1,b=1,c=1,d=1;
        int sum = 1;
        if(time.charAt(0)=='?'&&time.charAt(1)>'4'&&time.charAt(1)<='9'){
            a=2;
        }else if(time.charAt(0)=='?'&&time.charAt(1)<='4'&&time.charAt(1)>='0'){
            a=3;
        }
        if(time.charAt(1)=='?'&&time.charAt(0)<='1'&&time.charAt(0)>='0'){
            b=10;
        }else if(time.charAt(1)=='?'&&time.charAt(0)=='2'){
            b=4;
        }
        if(time.charAt(0)=='?'&&time.charAt(1)=='?'){
            a=3;
            b=8;
        }

        if(time.charAt(3)=='?'&&time.charAt(1)!='?'){
            c=6;
        }else if(time.charAt(4)=='?'&&time.charAt(3)!='?'){
            d=10;
        }else if(time.charAt(3)=='?'&&time.charAt(4)=='?'){
            c=6;
            d=10;
        }

        sum=a*b*c*d;
        return sum;
    }
}
