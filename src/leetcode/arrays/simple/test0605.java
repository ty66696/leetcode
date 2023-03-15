package leetcode.arrays.simple;

public class test0605 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,1};
        int n=2;
        canPlaceFlowers(flowerbed,n);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index=1;
        for (int i = 0; i < flowerbed.length&&n>=0;i++ ) {
            if(flowerbed[i]==1){
                index=0;
            }
            else{
                index++;
                if(index==3){
                    n--;
                    index=1;
                }
            }
            if(index==2&&i==flowerbed.length-1)
                n--;
        }
        if(n>0)
            return false;
        else
            return true;
    }
}
