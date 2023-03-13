package leetcode.strings.simple;

public class test2409 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String s1 = arriveAlice.substring(0, 2);
        String s2 = leaveAlice.substring(0, 2);
        String s3 = arriveBob.substring(0, 2);
        String s4 = leaveBob.substring(0, 2);
        String k1 = arriveAlice.substring(3);
        String k2 = leaveAlice.substring(3);
        String k3 = arriveBob.substring(3);
        String k4 = leaveBob.substring(3);
        int d1 = Integer.parseInt(s1)-1;
        int d2 = Integer.parseInt(s2)-1;
        int d3 = Integer.parseInt(s3)-1;
        int d4 = Integer.parseInt(s4)-1;
        int b1 = Integer.parseInt(k1);
        int b2 = Integer.parseInt(k2);
        int b3 = Integer.parseInt(k3);
        int b4 = Integer.parseInt(k4);
        int sum1=0,sum2=0,sum3=0,sum4=0;
        for (int i = 0; i < d1; i++) {
            sum1=sum1+day[i];
        }
        for (int i = 0; i < d2; i++) {
            sum2=sum2+day[i];
        }
        for (int i = 0; i < d3; i++) {
            sum3=sum3+day[i];
        }
        for (int i = 0; i < d4; i++) {
            sum4=sum4+day[i];
        }
        int day1=0,day2=0,day3=0,day4=0;
        day1=sum1+b1;
        day2=sum2+b2;
        day3=sum3+b3;
        day4=sum4+b4;
        if(day4<day2)
            return 0;
        else if(day4>=day1&&day4<=day2&&day3<day1)
            return day4-day1;
        else if(day3>=day1&&day4<=day2)
            return day4-day3;
        else if(day3>=day1&&day3<=day2&&day4>day2)
            return day2-day3;
        else if(day1>day3&&day2<day4)
            return day2-day1+1;
        else
            return 0;
    }
}


