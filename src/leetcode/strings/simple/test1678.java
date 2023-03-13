package leetcode.strings.simple;

public class test1678 {
    public String interpret(String command) {
        String s ="";
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if(c=='G'){
                s=s+c;
            }else if(c=='('&&command.charAt(i+1)==')'){
                s=s+'o';
                i++;
            }else {
                s=s+"al";
                i=i+3;
            }
        }
        return s;
    }
}
