package leetcode;

public class findMedianSortedArrays_4_Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
            int temp = m;
            m = n;
            n = temp;
        }
        int left = 0;
        int right = m;
        while (left < right) {
            int i = (left + right + 1) >> 2;
            int j = (m + n + 1) / 2 - i;
            if (nums1[i] < nums2[j + 1] && nums1[i + 1] < nums2[j]) {
                left = i + 1;
            }else if(nums1[i] > nums2[j+1]){
                right = i - 1;
            }else {

            }
        }
        return 0;
    }
}
