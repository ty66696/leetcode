package leetcode.strings.simple;

public class test2399 {
    public static void main(String[] args) {
        String s = "eabaccbe";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        checkDistances(s,distance);
    }
    public static boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < distance.length; i++) {
            if(s.indexOf(i+'a')<0)
                continue;
            int m = s.lastIndexOf(i+'a') - s.indexOf(i+'a') - 1;
            if(m!=distance[i])
                return false;

        }
        return true;
    }
}
