package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p047_permuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(ans, path, visited, nums);
        return ans;
    }

    void dfs(List<List<Integer>> ans, ArrayList<Integer> path, boolean[] visited, int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] || i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) continue;
                visited[i] = true;
                path.add(nums[i]);
                dfs(ans, path, visited, nums);
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}