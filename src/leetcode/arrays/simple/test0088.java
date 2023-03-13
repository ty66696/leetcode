package leetcode.arrays.simple;

public class test0088 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int m=3,n=3;
        int[] nums2 = {2,5,6};
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n - 1;
        m--;n--;
        while(m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;i--;
            } else {
                nums1[i] = nums2[n];
                n--;i--;
            }
        }
        while (m >= 0) {
            nums1[i--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
    }
}
