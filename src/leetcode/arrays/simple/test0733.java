package leetcode.arrays.simple;

public class test0733 {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        floodFill(image,sr,sc,newColor);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int k = image[sr][sc];
        if(sr>0&&image[sr-1][sc]==k){
            if(image[sr-1][sc] != color) {
                image[sr - 1][sc] = color;
                floodFill(image, sr - 1, sc, color);
            }
        }else if(sr<image.length-1&&image[sr+1][sc]==k){
            if(image[sr+1][sc] != color) {
                image[sr + 1][sc] = color;
                floodFill(image, sr + 1, sc, color);
            }
        }else if(sc>0&&image[sr][sc-1]==k){
            if(image[sr][sc-1] != color) {
                image[sr][sc-1] = color;
                floodFill(image, sr, sc-1, color);
            }
        }else if(sr<image[0].length-1&&image[sr][sc+1]==k){
            if(image[sr][sc+1] != color) {
                image[sr][sc+1] = color;
                floodFill(image, sr , sc+1, color);
            }
        }
        return image;
    }
}
