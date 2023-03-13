package leetcode.strings.simple;

public class test2224 {
    public int convertTime(String current, String correct) {
        String s1 = current.substring(0, 2);
        String s2 = current.substring(3);
        String s3 = correct.substring(0, 2);
        String s4 = correct.substring(3);
        int k1 = Integer.parseInt(s1);
        int k2 = Integer.parseInt(s2);
        int k3 = Integer.parseInt(s3);
        int k4 = Integer.parseInt(s4);
        int m1 = (k3 - k1) * 60;
        int m2 = k4 - k2;
        int m = m1+m2;
        int i = 0;
        int index = 0;
        if(m>0){
            i=m/60;
            m=m%60;
            index=index+i;
            if(m>0){
                i=m/15;
                m=m%15;
                index=index+i;
                if(m>0){
                    i=m/5;
                    m=m%5;
                    index=index+i;
                    if(m>0){
                        i=m/1;
                        index=index+i;
                    }else
                        return index;
                }else
                    return index;
            }else
                return index;
        }else
            return index;

        return index;
    }
}
