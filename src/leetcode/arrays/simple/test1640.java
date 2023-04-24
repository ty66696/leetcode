package leetcode.arrays.simple;

public class test1640 {
    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};
        canFormArray(arr,pieces);
    }
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j < pieces.length; j++) {
                if(pieces[j][0]==arr[i]){
                    if(i==arr.length-1)
                        break;
                    int k = pieces[j].length-1;
                    int m=1;
                    while (k>0){
                        i++;
                        if(arr[i]!=pieces[j][m]){
                            return false;
                        }
                        m++;
                        k--;
                    }
                    break;
                }
            }
            if(j==pieces.length)
                return false;
        }
        return true;
    }
}
