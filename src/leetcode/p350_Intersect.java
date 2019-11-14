package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class p350_Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] oArr = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i], 1);
        }
        int count = 0;
        for(int i=0; i<nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                oArr[count++] = nums2[i];
                map.put(nums2[i], map.get(nums2[i]) - 1);

                if(map.get(nums2[i]) == 0)
                    map.remove(nums2[i]);
            }
        }
        return Arrays.copyOf(oArr,count);
    }
}
