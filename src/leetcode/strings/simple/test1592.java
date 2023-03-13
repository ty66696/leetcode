package leetcode.strings.simple;

public class test1592 {
    public String reorderSpaces(String text) {
        int index = 0;
        String s3 = "";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==' '){
                index++;
                s3 = s3+text.charAt(i);
            }
        }
        String[] split = text.trim().split("\\s+");
        int length = split.length;
        if(length==1){
            return split[0]+s3;
        }
        StringBuilder sb = new StringBuilder();
        int num = index / (length - 1);
        int num2 = index%(length-1);
        String str = "";
        String str2 = "";
        for (int i = 0; i < num; i++) {
            str = str+" ";
        }
        for (int i = 0; i < num2; i++) {
            str2 = str2+" ";
        }
        for (int i = 0; i < split.length; i++) {
            if(i==split.length-1){
                sb.append(split[i]);
                sb.append(str2);
                break;
            }
            sb.append(split[i]);
            sb.append(str);

        }
        return sb.toString();
    }
}
