package leetcode.strings.simple;

public class test1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        defangIPaddr(address);
    }
    public static String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < split.length; i++) {
            if(i<split.length-1){
                sb.append(split[i]).append("[.]");
            }else
                sb.append(split[i]);
        }
        return sb.toString();
    }
}
