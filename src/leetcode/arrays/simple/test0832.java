package leetcode.arrays.simple;

public class test0832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[0].length-j-1];
                image[i][image[0].length-j-1] = temp;

            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j]=(image[i][j]+1)%2;
                image[i][image[0].length-j-1] = (image[i][image[0].length-j-1]+1)%2;
            }
        }
        return image;
    }
}
