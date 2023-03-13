package leetcode.strings.simple;

public class test1736 {
    public static void main(String[] args) {
        String time ="00:??";
        maximumTime(time);
    }
    public static String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        if(time.charAt(0)=='?'&&time.charAt(1)!='?'){
            if(time.charAt(1)<='3'){
                sb.append('2').append(time.charAt(1));
            }else
                sb.append('1').append(time.charAt(1));
        }else if(time.charAt(1)=='?'&&time.charAt(0)!='?'){
            if(time.charAt(0)<'2'){
                sb.append(time.charAt(0)).append('9');
            }else
                sb.append(time.charAt(0)).append('3');
        }else if(time.charAt(0)=='?'&time.charAt(1)=='?')
            sb.append("23");
        else
            sb.append(time.charAt(0)).append(time.charAt(1));
        sb.append(":");
        if(time.charAt(3)=='?'&&time.charAt(4)!='?'){
            sb.append('5').append(time.charAt(4));
        }else if(time.charAt(4)=='?'&&time.charAt(3)!='?')
            sb.append(time.charAt(3)).append('9');
        else if(time.charAt(3)=='?'&&time.charAt(4)=='?')
            sb.append("59");
        else
            sb.append(time.charAt(3)).append(time.charAt(4));
        return sb.toString();
    }
}
