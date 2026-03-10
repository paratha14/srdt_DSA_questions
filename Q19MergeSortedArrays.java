// Question 19: Merge Two Sorted Arrays
// Merge nums2 into nums1 in-place (sorted). nums1 has extra space at end.
// Sample Input: nums1=[1,2,3,0,0,0] m=3, nums2=[2,5,6] n=3
// Sample Output: [1,2,2,3,5,6]

import java.util.Arrays;

public class Q19MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        while (j >= 0) nums1[k--] = nums2[j--];
    }
}
