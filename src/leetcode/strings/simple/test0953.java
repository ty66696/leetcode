package leetcode.strings.simple;

public class test0953 {
    public static void main(String[] args) {
        String[] words = new String[]{"apple","apple","app"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        isAlienSorted(words,order);
    }
    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length-1; i++) {
            int i1=0;
            while (i1 < Math.min(words[i].length(),words[i+1].length())&&words[i].charAt(i1)==words[i+1].charAt(i1)) {
                i1++;
            }
            if(i1==words[i+1].length()&&i1<words[i].length()){
                return false;
            }else if(i1==words[i].length()&&i1<words[i+1].length()){
                continue;
            }else if(i1==words[i].length()&&i1==words[i+1].length()){
                continue;
            } else {
                char c = words[i].charAt(i1);
                char c2 = words[i+1].charAt(i1);
                if (order.indexOf(c) > order.indexOf(c2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
