package leetcode;

public class p026_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[index++] = tmp;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
        }
        return index;
    }
}
