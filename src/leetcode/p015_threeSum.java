package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p015_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length <= 2) {
            return ans;
        }
        Arrays.sort(nums);
        for (int p1 = 0; p1 < nums.length - 2; p1++) {
            int p2 = p1 + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {
                if (nums[p1] + nums[p2] + nums[p3] == 0) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[p1]);
                    tmp.add(nums[p2]);
                    tmp.add(nums[p3]);
                    ans.add(tmp);
                    while (p1 < nums.length -2 && nums[p1 + 1]== nums[p1]){
                        p1++;
                    }
                    while (p2 + 1 < p3 && nums[p2 + 1] == nums[p2]) {
                        p2++;
                    }
                    while (p3 - 1 > p2 && nums[p3 - 1] == nums[p3]) {
                        p3--;
                    }
                    p2++;
                    p3--;
                } else if (nums[p1] + nums[p2] + nums[p3] > 0) {
                    p3--;
                } else {
                    p2++;
                }
            }
        }
        return ans;
    }
}
