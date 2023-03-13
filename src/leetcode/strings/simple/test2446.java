package leetcode.strings.simple;

public class test2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        String s1 = event1[0];
        int i1 = Integer.parseInt(s1.substring(0, 2));
        int j1 = Integer.parseInt(s1.substring(3));
        int sum1 = i1 * 60 + j1;

        String s2 = event1[1];
        int i2 = Integer.parseInt(s2.substring(0, 2));
        int j2 = Integer.parseInt(s2.substring(3));
        int sum2 = i2 * 60 + j2;

        String s3 = event2[0];
        int i3 = Integer.parseInt(s3.substring(0, 2));
        int j3 = Integer.parseInt(s3.substring(3));
        int sum3 = i3 * 60 + j3;

        String s4 = event2[1];
        int i4 = Integer.parseInt(s4.substring(0, 2));
        int j4 = Integer.parseInt(s4.substring(3));
        int sum4 = i4 * 60 + j4;

        if(sum3>=sum2||sum4<=sum1)
            return true;
        else
            return false;
    }
}
