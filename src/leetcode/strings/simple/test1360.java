package leetcode.strings.simple;

public class test1360 {
    public static void main(String[] args) {
        String date2 = "2020-01-15", date1 = "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }
    public static int daysBetweenDates(String date1, String date2) {
        if(date1.compareTo(date2)>0){
            String temp = "";
            temp = date2;
            date2 = date1;
            date1 = temp;
        }
        int year1 = Integer.parseInt(date1.substring(0, 4));
        int month1 = Integer.parseInt(date1.substring(5, 7));
        int day1 = Integer.parseInt(date1.substring(8));

        int year2 = Integer.parseInt(date2.substring(0, 4));
        int month2 = Integer.parseInt(date2.substring(5, 7));
        int day2 = Integer.parseInt(date2.substring(8));

        int[] amount1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] amount2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year1 % 400 == 0 || (year1 % 4 == 0 && year1 % 100 != 0)) {
            ++amount1[1];
        }
        if (year2 % 400 == 0 || (year2 % 4 == 0 && year2 % 100 != 0)) {
            ++amount2[1];
        }
        int count1 = 0;
        for (int i : amount1) {
            count1=count1+i;
        }

        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < month2 - 1; ++i) {
            ans2 += amount2[i];
        }
        for (int i = 0; i < month1 - 1; ++i) {
            ans1 += amount1[i];
        }
        if(year1==year2){
            return ans2+day2-ans1-day1;
        }
        ans2=ans2+day2;
        ans1=count1-ans1-day1;
        int a=0;
        for(int i = year1+1;i<year2;i++){
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                a=a+366;
            }else
                a=a+365;
        }
        return ans1+ans2+a;
    }
}
