package leetcode.strings.simple;

import com.sun.xml.internal.ws.util.StringUtils;

public class test1507 {
    public String reformatDate(String date) {
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] s = date.split(" ");
        String year = s[2];
        String day="";
        String month1="";
        for (int i = 0; i < s[0].length(); i++) {
            if(s[0].charAt(i)>='0'&&s[0].charAt(i)<='9'){
                day=day+s[0].charAt(i);
                if(day.length()==1){
                    day = 0+day;
                }
            }

            else
                break;
        }
        for (int i = 0; i < month.length; i++) {
            if(month[i].equals(s[1])){
                month1 = i+1+"";
                if(month1.length()==1){
                    month1 = 0+month1;
                }
                break;
            }
        }
        return year+"-"+month1+"-"+day;
    }
}
