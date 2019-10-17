package leetcode;

public class Merge_88_Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int tail = nums1.length - 1;
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] <= nums2[p2])
                nums1[tail--] = nums2[p2--];
            else
                nums1[tail--] = nums1[p1--];
        }
        if (p1 < 0) for (; tail >= 0; tail--) nums1[tail] = nums2[p2--];
    }
}
