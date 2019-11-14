package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p018_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length <= 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int p1 = 0; p1 < nums.length - 3; p1++) {
            if (p1 > 0 && nums[p1 - 1] == nums[p1]) {
                continue;
            }
            for (int p2 = p1 + 1; p2 < nums.length - 2; p2++) {
                if (p2 > p1 + 1 && nums[p2 - 1] == nums[p2]) {
                    continue;
                }
                int p3 = p2 + 1;
                int p4 = nums.length - 1;
                while (p3 < p4) {
                    if (nums[p1] + nums[p2] + nums[p3] + nums[p4] == target) {
                        ArrayList<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[p1]);
                        tmp.add(nums[p2]);
                        tmp.add(nums[p3]);
                        tmp.add(nums[p4]);
                        ans.add(tmp);
                        while (p3 + 1 < p4 && nums[p3 + 1] == nums[p3]) {
                            p3++;
                        }
                        while (p4 - 1 > p3 && nums[p4 - 1] == nums[p4]) {
                            p4--;
                        }
                        p3++;
                        p4--;
                    } else if (nums[p1] + nums[p2] + nums[p3] + nums[p4] > target) {
                        p4--;
                    } else {
                        p3++;
                    }
                }
            }
        }
        return ans;
    }
}
