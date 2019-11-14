package leetcode;

public class p001_twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int flag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) break;
        }
        return ans;
    }
}
