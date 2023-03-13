package leetcode.strings.simple;

public class test0806 {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int index = 1;
        for (int i = 0; i < s.length(); i++) {
            int i1 = s.charAt(i) - 'a';
            int width = widths[i1];
            if(sum+width>100){
                sum=0;
                index++;
            }
            sum=sum+width;
        }
        int[] m = new int[2];
        m[0] = index;
        m[1]= sum;
        return m;
    }
}
