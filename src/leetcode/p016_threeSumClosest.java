package leetcode;

import java.util.Arrays;

public class p016_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length <= 2) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int p1 = 0; p1 < nums.length - 2; p1++) {
            int p2 = p1 + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {
                if (nums[p1] + nums[p2] + nums[p3] == target) {
                    return target;
                } else if (nums[p1] + nums[p2] + nums[p3] > target) {
                    if (Math.abs(target - ans) > Math.abs(nums[p1] + nums[p2] + nums[p3] - target)) {
                        ans = nums[p1] + nums[p2] + nums[p3];
                    }
                    p3--;
                } else {
                    if (Math.abs(target - ans) > Math.abs(nums[p1] + nums[p2] + nums[p3] - target)) {
                        ans = nums[p1] + nums[p2] + nums[p3];
                    }
                    p2++;
                }
            }
        }
        return ans;
    }
}
